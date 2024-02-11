package br.com.escuderodev.escola.infra.aluno;

import br.com.escuderodev.escola.domain.aluno.Aluno;
import br.com.escuderodev.escola.domain.aluno.AlunoNaoEncontrado;
import br.com.escuderodev.escola.domain.aluno.AlunoRepository;
import br.com.escuderodev.escola.domain.componentes.CPF;
import br.com.escuderodev.escola.domain.componentes.Email;
import br.com.escuderodev.escola.domain.componentes.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AlunoRepositoryWithJDBC implements AlunoRepository {
    private final Connection connection;

    public AlunoRepositoryWithJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricularAluno(Aluno aluno) {
        try {
            String sql = "insert into alunos values (?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, aluno.getCpf());
            pstm.setString(2, aluno.getNome());
            pstm.setString(3, aluno.getEmail());
            pstm.execute();

            sql = "insert into telefone values (?,?)";
            pstm = connection.prepareStatement(sql);

            for (Telefone telefone : aluno.getTelefones()) {
                pstm.setString(1, telefone.getDdd());
                pstm.setString(2, telefone.getNumeroDeTelefone());
                pstm.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarAlunoPorCpf(CPF cpf) {
        try {
            String sql = "SELECT id, nome, email FROM ALUNO WHERE cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpf.getNumeroDoCPF());

            ResultSet rs = ps.executeQuery();
            boolean encontrou = rs.next();
            if (!encontrou) {
                throw new AlunoNaoEncontrado(cpf);
            }

            String nome = rs.getString("nome");
            Email email = new Email(rs.getString("email"));
            Aluno encontrado = new Aluno(cpf, nome, email);

            Long id = rs.getLong("id");
            sql = "SELECT ddd, numero FROM TELEFONE WHERE aluno_id = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String numero = rs.getString("numero");
                String ddd = rs.getString("ddd");
                encontrado.adicionarTelefone(ddd, numero);
            }

            return encontrado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Aluno> listarTodosOsAlunosMatriculados() {
        return null;
    }
}

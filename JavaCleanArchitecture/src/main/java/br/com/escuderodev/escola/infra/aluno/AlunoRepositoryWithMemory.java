package br.com.escuderodev.escola.infra.aluno;

import br.com.escuderodev.escola.domain.aluno.Aluno;
import br.com.escuderodev.escola.domain.aluno.AlunoNaoEncontrado;
import br.com.escuderodev.escola.domain.aluno.AlunoRepository;
import br.com.escuderodev.escola.domain.componentes.CPF;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryWithMemory implements AlunoRepository {

    private List<Aluno> alunosMatriculados = new ArrayList<>();

    @Override
    public void matricularAluno(Aluno aluno) {
        this.alunosMatriculados.add(aluno);
    }

    @Override
    public Aluno buscarAlunoPorCpf(CPF cpf) {
        return this.alunosMatriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumeroDoCPF()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosOsAlunosMatriculados() {
        return this.alunosMatriculados;
    }
}

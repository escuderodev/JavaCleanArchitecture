package br.com.escuderodev.escola.domain.aluno;

import br.com.escuderodev.escola.domain.componentes.CPF;

import java.util.List;

public interface AlunoRepository {
    public void matricularAluno(Aluno aluno);
    public Aluno buscarAlunoPorCpf(CPF cpf);
    List<Aluno> listarTodosOsAlunosMatriculados();
}

package br.com.escuderodev.escola.infra.service;

import br.com.escuderodev.escola.domain.aluno.Aluno;
import br.com.escuderodev.escola.infra.aluno.AlunoRepositoryWithJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private AlunoRepositoryWithJPA repository;
    public AlunoService(AlunoRepositoryWithJPA repository) {
        this.repository = repository;
    }

    public void matricularAluno(Aluno aluno) {
        repository.save(aluno);
    }

    public Aluno buscarAlunoPorCpf(String cpf) {
        return repository.findAlunoByCpf(cpf);
    }

    public List<Aluno> listarTodosOsAlunosMatriculados() {
        return repository.findAll();
    }
}

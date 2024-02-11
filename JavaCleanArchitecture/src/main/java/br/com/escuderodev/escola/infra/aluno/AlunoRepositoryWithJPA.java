package br.com.escuderodev.escola.infra.aluno;

import br.com.escuderodev.escola.domain.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositoryWithJPA extends JpaRepository<Aluno, String> {

    public Aluno findAlunoByCpf(String cpf);
}

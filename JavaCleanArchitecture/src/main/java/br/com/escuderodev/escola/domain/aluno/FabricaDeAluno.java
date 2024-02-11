package br.com.escuderodev.escola.domain.aluno;

import br.com.escuderodev.escola.domain.componentes.CPF;
import br.com.escuderodev.escola.domain.componentes.Email;

public class FabricaDeAluno {
    private Aluno aluno;

    public FabricaDeAluno comNomeCpfEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
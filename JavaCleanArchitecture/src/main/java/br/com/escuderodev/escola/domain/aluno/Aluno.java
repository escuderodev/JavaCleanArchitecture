package br.com.escuderodev.escola.domain.aluno;

import br.com.escuderodev.escola.domain.componentes.CPF;
import br.com.escuderodev.escola.domain.componentes.Email;
import br.com.escuderodev.escola.domain.componentes.Telefone;

import java.util.ArrayList;
import java.util.List;

//classe do tipo Entity
public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numeroDeTelefone) {
        this.telefones.add(new Telefone(ddd, numeroDeTelefone));
    }

    public String getCpf() {
        return cpf.getNumeroDoCPF();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEnderecoDeEmail();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}

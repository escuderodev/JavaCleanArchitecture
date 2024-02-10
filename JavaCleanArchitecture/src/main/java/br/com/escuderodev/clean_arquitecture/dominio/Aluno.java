package br.com.escuderodev.clean_arquitecture.dominio;

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

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}

package br.com.escuderodev.clean_arquitecture.dominio;

public class Indicacao {

    private Aluno Indicante;
    private Aluno Indicado;

    public Indicacao(Aluno indicante, Aluno indicado) {
        Indicante = indicante;
        Indicado = indicado;
    }
}

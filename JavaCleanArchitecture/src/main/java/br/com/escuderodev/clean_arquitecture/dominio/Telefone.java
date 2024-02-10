package br.com.escuderodev.clean_arquitecture.dominio;
//classe do tipo Value Object
public class Telefone {
    private String ddd;
    private String numeroDeTelefone;

    public Telefone(String ddd, String numeroDeTelefone) {
        if ((ddd == null || !ddd.matches("[0-9]{3}") || (numeroDeTelefone == null || !numeroDeTelefone.matches("[0-9]{8}") || !numeroDeTelefone.matches("[0-9]{9}")))) {
            throw new IllegalArgumentException("Número de telefone inválido!");
        } else {
            this.ddd = ddd;
            this.numeroDeTelefone = numeroDeTelefone;
        }
    }
}

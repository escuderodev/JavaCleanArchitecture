package br.com.escuderodev.escola.domain.componentes;
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

    public String getDdd() {
        return ddd;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numeroDeTelefone;
    }
}

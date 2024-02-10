package br.com.escuderodev.clean_arquitecture.dominio;
//classe do tipo Value Object
public class CPF {
    private String numeroDoCPF;
    public CPF(String numeroDoCPF) {
        if (numeroDoCPF == null || !numeroDoCPF.matches("/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/")) {
            throw new IllegalArgumentException("CPF no formato inválido!");
        } else  {
            this.numeroDoCPF = numeroDoCPF;
        }
    }
}

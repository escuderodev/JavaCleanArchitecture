package br.com.escuderodev.escola.domain.componentes;
//classe do tipo Value Object
public class Email {
    private String enderecoDeEmail;

    public Email(String enderecoDeEmail) {
        if (enderecoDeEmail == null || !enderecoDeEmail.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i")) {
            throw new IllegalArgumentException("E-mail inválido!");
        } else {
            this.enderecoDeEmail = enderecoDeEmail;
        }
    }

    public String getEnderecoDeEmail() {
        return enderecoDeEmail;
    }
}

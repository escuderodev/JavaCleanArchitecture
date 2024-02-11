package br.com.escuderodev.escola.domain.aluno;

import br.com.escuderodev.escola.domain.componentes.CPF;

public class AlunoNaoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumeroDoCPF());
    }

}

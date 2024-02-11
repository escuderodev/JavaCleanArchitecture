package br.com.escuderodev.escola.domain.indicacao;

import br.com.escuderodev.escola.domain.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno Indicante;
    private Aluno Indicado;
    private LocalDateTime dataDaIndicacao = LocalDateTime.now();

    public Indicacao(Aluno indicante, Aluno indicado) {
        Indicante = indicante;
        Indicado = indicado;
    }

    public Aluno getIndicante() {
        return Indicante;
    }

    public Aluno getIndicado() {
        return Indicado;
    }

    public LocalDateTime getDataDaIndicacao() {
        return dataDaIndicacao;
    }
}

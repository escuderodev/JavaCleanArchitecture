package br.com.escuderodev.escola;

import br.com.escuderodev.escola.domain.aluno.Aluno;
import br.com.escuderodev.escola.domain.aluno.FabricaDeAluno;

public class Main {
    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno aluno = fabrica.comNomeCpfEmail("Eduardo Escudero", "616.791.110-00", "escuderodev@gmail.com")
                .comTelefone("11","955005284")
                .comTelefone("11","32510687")
                .criar();

//        verificar patterns builder e Factory para implementar ordem de métodos e limitar a chamada do método comNomeCepEmail apenas uma vez
    }
}
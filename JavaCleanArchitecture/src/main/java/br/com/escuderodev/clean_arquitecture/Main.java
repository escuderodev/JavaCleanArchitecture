package br.com.escuderodev.clean_arquitecture;

import br.com.escuderodev.clean_arquitecture.dominio.Telefone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Telefone telefone = new Telefone("011","955005284");
        System.out.println(telefone);
    }
}
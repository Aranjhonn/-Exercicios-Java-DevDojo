package com.aranjhonn.maratonajava.javacore.Bintroducaometodos.test;

import com.aranjhonn.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

//        pessoa.imprime();
    }
}

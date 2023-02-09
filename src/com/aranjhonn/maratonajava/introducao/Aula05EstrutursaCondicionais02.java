package com.aranjhonn.maratonajava.introducao;

public class Aula05EstrutursaCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 19;
        String categoria;                        // OBS; Todas as variáveis locais precisam ser inicializadas

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18 ) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);

    }
}

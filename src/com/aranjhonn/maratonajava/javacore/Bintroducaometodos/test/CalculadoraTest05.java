package com.aranjhonn.maratonajava.javacore.Bintroducaometodos.test;

import com.aranjhonn.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}

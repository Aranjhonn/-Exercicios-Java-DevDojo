package com.aranjhonn.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean

        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.00;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;  // Traduz pela tabela ASCII/Unicode

        String nome = "Goku";

        System.out.println("The age is: " + idade + " year");
        System.out.println(falso);
        System.out.println("char is: " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Hi, my name is: " + nome);
    }
}

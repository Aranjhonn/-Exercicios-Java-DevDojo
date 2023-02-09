package com.aranjhonn.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / * (Aritiméticos)
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // % (Resto ou Módulo)
        int resto = 21 % 2;
        System.out.println(resto);

        // < <= > >= == != (Relacionais) Sempre vão retornar valores booleanos (Verdadeiro ou Falso)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        System.out.println("isDezMaiorIgualQueVinte " + isDezMaiorIgualQueVinte);
        System.out.println("isDezMenorIgualQueVinte " + isDezMenorIgualQueVinte);

        // &&(AND) ||(OR) !(NOT)  (Lógicos: Verdadeiro ou Falso e Negação)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPouoanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
                || valorTotalContaPouoanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %= (Operadores de Atribuição)
        double bonus = 1800; // -> 1800
        bonus += 1000;       // -> 2800
        bonus -= 1000;       // -> 1800
        bonus *= 2;          // -> 3600
        bonus /= 2;          // -> 1800
        bonus %= 2;          // -> 0.0
        System.out.println(bonus);

        // ++ -- Operadores Unários (Incremento e Decremento) ATEÇÃO: ao colocar antes ou depois da variável
        int contador = 0;
        contador += 1;  // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);

    }
}

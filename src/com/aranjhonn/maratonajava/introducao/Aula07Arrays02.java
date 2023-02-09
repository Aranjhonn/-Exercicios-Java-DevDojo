package com.aranjhonn.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Tipos de inicialização padrão:
        // byte, short, int, long, float e double, o valor padrão é '0'.
        // char é um unicode, espaço em branco: '\u0000' ' '.
        // boolean é 'false'.
        // todos do tipo reference: String ou qualquer outro o valor é 'null'.

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
    }
}

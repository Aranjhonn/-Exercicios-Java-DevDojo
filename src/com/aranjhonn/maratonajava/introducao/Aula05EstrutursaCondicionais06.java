package com.aranjhonn.maratonajava.introducao;

public class Aula05EstrutursaCondicionais06 {
    public static void main(String[] args) {
        // Utilizando 'switch case' e dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 com domingo

        byte dia = 3;
        switch (dia) {
            case 1:
            case 2:
                System.out.println("Fim de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opsão Inválida");
                break;
        }
    }
}

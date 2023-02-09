package com.aranjhonn.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3];

        //Inicializando Array diretamente com os valores:
        int[] numeros2 = {1, 2, 3, 4, 5};
        //Outra forma:
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        
        //Imprimindo com o 'foreach'
        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}

package com.aranjhonn.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // While, do while, for
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        count = 10;
        do {
            System.out.println("Dentro do 'do while'" + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}

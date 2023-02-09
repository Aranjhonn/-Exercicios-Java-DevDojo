package com.aranjhonn.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

import javax.xml.crypto.Data;

public class Aula03TiposPrimitivosExercícios {
    public static void main(String[] args) {
        String nome = "Aranjhonn";
        String endereco = "Joao Alves 40";
        double salario = 5300.89;
        String dataRecebimentoSalario = "12/12/2022";

        String relatorio = "Eu " + nome
                + ", morando no endereco " + endereco
                + ", confirmo que recebi o salario de " + salario
                + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}

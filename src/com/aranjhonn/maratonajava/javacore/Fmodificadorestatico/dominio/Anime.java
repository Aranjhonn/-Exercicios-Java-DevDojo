package com.aranjhonn.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Ordem de execução:
    // 0 - Bloco de inicialização é executado quando a JVM carrega a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    //Bloco de inicialização de instância
    static {
        System.out.println("Dentro do bloco de inicialização statico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização statico 2");

    }

    static {
        System.out.println("Dentro do bloco de inicialização statico 3");

    }

    {
        System.out.println("Dentro do bloco de inicialização não statico 4");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

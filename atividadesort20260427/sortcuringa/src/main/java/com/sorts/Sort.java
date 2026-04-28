package com.sorts;

public abstract class Sort {
    private String nome;

    public Sort(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract int[] ordenar(int[] array);

    protected int[] copiar(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++)
            copia[i] = array[i];
        return copia;
    }

    protected void trocar(int[] array, int i, int j) {
        int temporario   = array[i];
        array[i]   = array[j];
        array[j]   = temporario;
    }

}


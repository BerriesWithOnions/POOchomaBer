package com.sorts;

public class InsertionSort extends Sort {

    public InsertionSort() {
        super("Insertion Sort");
    }

    @Override
    public int[] ordenar(int[] array) {
        int[] lista = copiar(array);
        int n = lista.length;
        for (int i = 1; i < n; i++) {
            int chave = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = chave;
        }
        return lista;
    }
}
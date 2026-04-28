package com.sorts;

public class QuickSort extends Sort {

    public QuickSort() {
        super("Quick Sort");
    }

    @Override
    public int[] ordenar(int[] array) {
        int[] lista = copiar(array);
        quickSortRec(lista, 0, lista.length - 1);
        return lista;
    }

    private void quickSortRec(int[] lista, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(lista, baixo, alto);
            quickSortRec(lista, baixo, pi - 1);
            quickSortRec(lista, pi + 1, alto);
        }
    }

    private int particionar(int[] lista, int baixo, int alto) {
        int pivo = lista[alto];
        int i = baixo - 1;
        for (int j = baixo; j < alto; j++) {
            if (lista[j] <= pivo) {
                i++;
                trocar(lista, i, j);
            }
        }
        trocar(lista, i + 1, alto);
        return i + 1;
    }
}
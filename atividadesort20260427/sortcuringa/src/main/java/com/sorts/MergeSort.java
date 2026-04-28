package com.sorts;

public class MergeSort extends Sort {

    public MergeSort() {
        super("Merge Sort");
    }
    
    private void merge(int[] lista, int esq, int meio, int dir) {
        int n1 = meio - esq + 1;
        int n2 = dir - meio;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = lista[esq + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = lista[meio + 1 + j];
        }
        
        int i = 0, j = 0, k = esq;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                lista[k++] = left[i++];
            } else {
                lista[k++] = right[j++];
            }
        }
        while (i < n1) {
            lista[k++] = left[i++];
        }
        while (j < n2) {
            lista[k++] = right[j++];
        }
    }

    private void mergeSortRec(int[] lista, int esq, int dir) {
        if (esq < dir) {
            int meio = (esq + dir) / 2;
            mergeSortRec(lista, esq, meio);
            mergeSortRec(lista, meio + 1, dir);
            merge(lista, esq, meio, dir);
        }
    }

    @Override
    public int[] ordenar(int[] array) {
        int[] lista = copiar(array);
        mergeSortRec(lista, 0, lista.length - 1);
        return lista;
    }
}
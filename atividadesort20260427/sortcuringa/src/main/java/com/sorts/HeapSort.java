package com.sorts;

public class HeapSort extends Sort {

    public HeapSort() {
        super("Heap Sort");
    }

    @Override
    public int[] ordenar(int[] array) {
        int[] lista = copiar(array);
        int comprimento = lista.length;
        for (int i = comprimento / 2 - 1; i >= 0; i--)
            heapify(lista, comprimento, i);
        for (int i = comprimento - 1; i > 0; i--) {
            trocar(lista, 0, i);
            heapify(lista, i, 0);
        }
        return lista;
    }

    private void heapify(int[] lista, int i1, int i2) {
        int maior = i2;
        int esq   = 2 * i2 + 1;
        int dir   = 2 * i2 + 2;
        if (esq < i1 && lista[esq] > lista[maior]) maior = esq;
        if (dir < i1 && lista[dir] > lista[maior]) maior = dir;
        if (maior != i2) {
            trocar(lista, i2, maior);
            heapify(lista, i1, maior);
        }
    }
}
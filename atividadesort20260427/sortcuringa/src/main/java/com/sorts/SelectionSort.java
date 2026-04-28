package com.sorts;

public class SelectionSort extends Sort {

    public SelectionSort() {
        super("Selection Sort");
    }

    @Override
    public int[] ordenar(int[] array) {
        int[] a = copiar(array);
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[minIdx])
                    minIdx = j;
            trocar(a, i, minIdx);
        }
        return a;
    }
}
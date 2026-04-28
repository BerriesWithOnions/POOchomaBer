package com.sorts;

public class BubbleSort extends Sort {
    public BubbleSort() {
        super("Bubble Sort");
    }

    @Override
    public int[] ordenar(int[] array) {
        int[] ordenada = copiar(array);
        int n = ordenada.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (ordenada[j] > ordenada[j + 1])
                    trocar(ordenada, j, j + 1);
        return ordenada;
    }
}


package com.sorts;

public class Main {

    public static int[] sortCuringa(int[] array, Sort algoritmo) {
        System.out.print("Usando " + algoritmo.getNome() + ": ");
        int[] resultado = algoritmo.ordenar(array);
        System.out.print("[");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        return resultado;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11, 90, 3, 47};

        System.out.print("Array original: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.println();

        sortCuringa(array, new BubbleSort());
        sortCuringa(array, new InsertionSort());
        sortCuringa(array, new SelectionSort());
        sortCuringa(array, new MergeSort());
        sortCuringa(array, new QuickSort());
        sortCuringa(array, new HeapSort());
    }
}
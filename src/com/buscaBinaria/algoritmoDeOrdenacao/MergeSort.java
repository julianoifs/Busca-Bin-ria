package com.buscaBinaria.algoritmoDeOrdenacao;

public final class MergeSort {

    public static void mergeSort(int[] v, int[] w, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(v, w, inicio, meio);
            mergeSort(v, w, meio + 1, fim);
            intercalar(v, w, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] v, int[] w, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++) {
            w[k] = v[k]; // Copiando elementos do vetor v para o vetor w
        }
        int i = inicio;
        int j = meio + 1;

        for (int k2 = inicio; k2 <= fim; k2++) {
            if (i > meio) {
                v[k2] = w[j++];
            } else if (j > fim) {
                v[k2] = w[i++];
            } else if (w[i] < w[j]) {
                v[k2] = w[i++];
            } else {
                v[k2] = w[j++];
            }
        }
    }
}

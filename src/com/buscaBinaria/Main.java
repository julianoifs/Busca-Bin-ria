package com.buscaBinaria;

import java.util.Arrays;
import java.util.Scanner;

import com.buscaBinaria.algoritmoDeOrdenacao.MergeSort;

public class Main {

    public static void main(String[] args) {

        int[] vetor = { 12, 8, 1, 3, 5, 11, 7, 9, 2, 6, 10, 4 };
        int[] vetorAux = new int[vetor.length]; // vetor auxiliar será usado para ordenação do vetor

        // apresentado o vetor desordenado
        System.out.println("Vetor desordenado");
        System.out.println(Arrays.toString(vetor));

        // ordenando o vetor com o Merge Sort
        MergeSort.mergeSort(vetor, vetorAux, 0, vetor.length - 1);
        System.out.println("\nVetor ordenado, após passar pelo algoritmo de ordenação Merge Sort");
        System.out.println(Arrays.toString(vetor));

        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme o Número buscado: ");
        int buscado = sc.nextInt();

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);

            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (achou == true) {
            System.out.println("\nO número " + buscado + " foi achado no vetor");
        } else {
            System.out.println("\nO número " + buscado + " não foi achado!");
        }

    }
}

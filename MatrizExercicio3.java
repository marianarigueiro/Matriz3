/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizexercicio3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class MatrizExercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        boolean possuiRepetidos = false;
        int pares = 0;
        int impares = 0;

        // Preenchendo a matriz e verificando números pares, ímpares e repetidos
        System.out.println("Digite os elementos da matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se é par ou ímpar
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                // Verifica repetição usando o conjunto HashSet
                if (elementos.contains(matriz[i][j])) {
                    possuiRepetidos = true;
                } else {
                    elementos.add(matriz[i][j]);
                }
            }
        }

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("a) A matriz possui elementos repetidos? " + (possuiRepetidos ? "Sim" : "Não"));
        System.out.println("b) Quantidade de números pares: " + pares);
        System.out.println("c) Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}

package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[15];
        int [] vetorB = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição: " + i + " ");
            vetorA[i] = leitor.nextInt();
            vetorB [i] = vetorA[i] * vetorA[i];
        }
        System.out.println("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B= ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}

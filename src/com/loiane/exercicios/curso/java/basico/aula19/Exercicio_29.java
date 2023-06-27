package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];
        int [] vetorB = new int [vetorA.length];
        int [] vetorC = new int [vetorA.length * 2];

        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com um número para a posição para o vetor A " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();

            vetorC[i] = vetorA[i];
        }

        for (int i=0; i<vetorB.length; i++){
            System.out.print("Entre com um número para a posição para o vetor B " + (i+1) + " ");
            vetorB[i] = leitor.nextInt();

            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B= ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor C= ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}

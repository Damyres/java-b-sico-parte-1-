package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [2];
        int [] vetorB = new int [2];
        int [] vetorC = new int [2];

        for(int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição " + i + " : ");
            vetorA[i] = leitor.nextInt();
        }

        for(int i=0; i<vetorB.length; i++){
            System.out.print("Entre com a posição " + i + " : ");
            vetorB[i] = leitor.nextInt();
        }

        for (int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("Vetor B= ");
        for (int i=0; i<vetorB.length;i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.print("Vetor C= ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}

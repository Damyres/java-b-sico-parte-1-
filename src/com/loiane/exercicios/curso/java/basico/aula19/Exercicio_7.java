package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [3];
        int [] vetorB = new int [vetorA.length];
        int [] vetorC = new int [vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.print("vetor A, entre com a posição " + i + " : ");
            vetorA[i] = leitor.nextInt();
        }
        for (int i= 0; i<vetorB.length; i++){
            System.out.print("vetor B, entre com a posição " + i + " : ");
            vetorB[i] = leitor.nextInt();
        }
        for (int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B= ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor C= ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }

    }
}

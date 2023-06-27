package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_28 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];
        int [] vetorB = new int [vetorA.length];

        for(int i=0; i<vetorA.length; i++){

            System.out.print("Entre com um número para a posição A " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();
            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

//        for (int i=0; i<vetorB.length; i++){
//            System.out.print("Entre com um número para a posição B " + (i+1) + " ");
//            vetorB[i] = leitor.nextInt();
//        }

//        int count = vetorA.length - 1;
//        for(int i = 0; i < vetorA.length; i++){
//            vetorB[i]= vetorA[count];
//            count--;
//        }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}

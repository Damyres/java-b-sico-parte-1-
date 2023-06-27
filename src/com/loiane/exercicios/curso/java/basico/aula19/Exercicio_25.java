package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length];


        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com um número para a posição de  " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0 ) ? 1 : 0;

        }

//        for (int i=0; i<vetorA.length; i++){
//            if(vetorA[i] % 2 == 0){
//                vetorB[i] = 1;
//            } else{
//                vetorB[i] = 0;
//            }
//        }


        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B= ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}

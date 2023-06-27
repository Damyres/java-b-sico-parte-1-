package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];
        int [] vetorB = new int [vetorA.length];
        int [] vetorC = new int [vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com um número para a posição de = " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();

          //  vetorB[i] = (vetorA[i] % 2 == 0 ) ? 1 : 0;
           // vetorC[i] = (vetorA[i] > vetorB[i]) ? 1;
        }
        for (int i=0; i<vetorB.length; i++){
            System.out.print("Entre com um número para a posição de B= "  + (i+1) + " ");
            vetorB[i] = leitor.nextInt();
        }
//        for(int i=0; i<vetorC.length; i++){
//            System.out.print("Entre com um número para a posição de C= " + (i+1) + " ");
//            vetorC[i] = leitor.nextInt();
//        }
        for(int i=0; i<vetorA.length; i++){
            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else if(vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
        }


        System.out.println();
        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor C= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}

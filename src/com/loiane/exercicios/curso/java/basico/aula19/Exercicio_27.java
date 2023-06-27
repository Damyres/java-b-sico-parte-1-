package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];
//        int [] vetorB = new int [vetorA.length];
        char [] vetorB = new char [vetorA.length];

        for(int i= 0; i<vetorA.length; i++){
            System.out.print("Entre com um numero para a posição de A= " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();

            if(vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7){
                vetorB[i] = 'b';
            } else if(vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            } else if(vetorA[i] == 10){
                vetorB[i] = 'd';
            }else {
                vetorB[i] = 'e';
            }
        }

//        for (int i=0; i<vetorB.length; i++){
//            System.out.print("Entre com um número para a posição B= " + (i+1) + " ");
//            vetorB[i] = (char) leitor.nextInt();
//        }

//        for (int i=0; i<vetorA.length; i++){
//            if(vetorA[i] < 7){
//                vetorB[i] = 'a';
//            } else if (vetorA[i] == 7){
//                vetorB[i] = 'b';
//            } else if(vetorA[i] > 7 && vetorA[i] < 10){
//                vetorB[i] = 'c';
//            } else if(vetorA[i] == 10){
//                vetorB[i] = 'd';
//            }else {
//                vetorB[i] = 'e';
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

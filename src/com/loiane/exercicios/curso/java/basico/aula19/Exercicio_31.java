package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_31 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);


        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i ++){
            System.out.print("Entre com um número para a posição " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();
        }

        int posA= 0;
        int posB = 0;

        for (int i=0; i<vetorA.length; i++){

            if(vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB ++;
            }

        }
        for (int i=0; i<vetorA.length; i++){
            if(vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB ++;
            }

        }


        System.out.println();
        System.out.print("Vetor A ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}

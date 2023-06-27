package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_34 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[10];

        int posPar=0;
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com um número para a posição A= " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();
        }

//        for (int i=0; i<vetorA.length; i++){
//            if(vetorA[i] % 2 == 0){
//                vetorA[posPar] = vetorA[i];
//                posPar++;
//            }
//        }
//
//        System.out.print("Vetor A= ");
//        for (int i=0; i<posPar; i++){
//            System.out.print(vetorA[i] + " ");
//        }

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Analisando o número " + vetorA[i]);

            for(int j=2; j<vetorA[i]; j++){
                if(j % 2 == 0){
                    System.out.println(j + " é par ");
                }

            }
            System.out.println();
        }
    }
}

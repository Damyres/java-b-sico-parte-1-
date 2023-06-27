package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[10];

            for(int i=0; i<vetorA.length; i++){
                System.out.print("Entre com a posição: " + (i+1) + " ");
                vetorA[i] = leitor.nextInt();
                if(vetorA[i] % 2 != 0){
                    break;
                }
            }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }
    }
}

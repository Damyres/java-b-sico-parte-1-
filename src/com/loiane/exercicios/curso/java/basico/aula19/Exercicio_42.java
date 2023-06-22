package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_42 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [5];

        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição " + i + " " );
            vetorA[i] = leitor.nextInt();
        }
        System.out.println();

        int menor=0;
        System.out.print("Vetor A= ");
        for (int i= 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

            if(vetorA[i] > menor){
                System.out.println(menor);
            }

        }
    }
}

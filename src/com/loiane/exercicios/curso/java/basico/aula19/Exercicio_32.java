package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_32 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        int [] vetorA = new int [5];

        for(int i=0; i<vetorA.length; i++){
            System.out.print("Entre com um valor da posição A " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();
        }
        for(int i=0; i<vetorA.length; i++){
            System.out.println("Tabuada de: " + vetorA[i]);

            for(int j=1; j<=10; j++){
                System.out.println(j +  " * " + vetorA[i] + " = " + (vetorA[i] * j));
            }
            System.out.println();
        }

    }
}

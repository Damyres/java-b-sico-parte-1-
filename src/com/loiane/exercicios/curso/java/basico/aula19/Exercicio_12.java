package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];

        int soma=0;
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição " + i + " : ");
            vetorA [i] = leitor.nextInt();
            soma +=vetorA[i];

        }
        System.out.println();
        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma de todas as posições inseridas é: " + soma);
    }
}

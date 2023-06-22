package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[4];

        int soma = 0;
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição: " + i + " ");
            vetorA[i] = leitor.nextInt();

            if(vetorA[i] % 5 ==0){
                soma +=vetorA[i];
            }
        }
        System.out.println();

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma dos números multiplos de 5 é " + soma);
    }
}

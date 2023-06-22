package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [5];

        for (int i=0; i<vetorA.length; i++) {
            System.out.print("Entre com a posição " + i + " : ");
            vetorA[i] = leitor.nextInt();
        }
        int qtdPares =0;
        for (int i=0; i<vetorA.length;i++){
            if(vetorA[i] % 2 == 0){
                qtdPares ++;
            }
        }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
    }
}

package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[10];

        int primeiraPosicao = 0;
        int ultimaPosicao = 0;
        for (int i=0; i<vetorA.length; i++){

            System.out.println("Entre com um número para a posição "+ (i+1) + " ");
            vetorA[i] = leitor.nextInt();

        }
        boolean  palindromo = true;
        for( int i=0; i<(vetorA.length/2); i++){

            if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }
        if(palindromo){
            System.out.println("Palindromo");
        }else {
            System.out.println("Não é palindromo");
        }

    }
}

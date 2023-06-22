package com.loiane.exercicios.curso.java.basico.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double [] vetorA = new double[2];
        double [] vetorB = new double[vetorA.length];


        for(int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição: " + i + " ");
            vetorA[i] = leitor.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Vetor A =");

        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B= ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(df.format( vetorB[i]) + " ");
        }

    }
}

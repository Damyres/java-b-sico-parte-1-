package com.loiane.exercicios.curso.java.basico.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double [] vetorA = new double [10];
        DecimalFormat df = new DecimalFormat("###,###.##");


//        for (int i=0; i<vetorA.length; i++){
//            System.out.print("Entre com a posição: " + i + " ");
//            vetorA[i] = leitor.nextInt();
//        }

        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = Math.random();
        }

        double countPar = 0;
        double countImpar = 0;
        for(int i=0; i<vetorA.length; i++){
           if(vetorA[i] % 2 == 0 ){
               countPar++;
           } else {
               countImpar++;
           }
        }
        System.out.println();
        System.out.print("Pares " + countPar );
        System.out.println();
        System.out.print("Ímpares " + countImpar);
        System.out.println();

        double percentualPar = (countPar / vetorA.length) * 100;
        double percentualImpar = (countImpar / vetorA.length) * 100;

        System.out.print("Percentual de pares no vetor A= " + df.format(percentualPar));
        System.out.println();
        System.out.print("Percentual de impares no vetor A= " + df.format(percentualImpar));

        System.out.println();
        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(df.format(vetorA[i]) + " ");
        }
    }
}

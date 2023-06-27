package com.loiane.exercicios.curso.java.basico.aula19;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];


        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição " + i + " ");
            vetorA[i] = leitor.nextInt();
        }

        int soma=0;
        double media =0;
        for (int i=0; i<vetorA.length; i++){
            if(vetorA[i] % 2 != 0){
                soma += vetorA[i];
            }
        }


        System.out.print("Soma total dos elementos ímpares: " + soma);

        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println();
        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        media = soma/vetorA.length;
        System.out.println();
        System.out.print("A média dos valores é: " + df.format(media));
    }
}

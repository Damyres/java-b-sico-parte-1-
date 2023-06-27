package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double [] vetorA = new double [20];

        double cotacaoDolar;

            System.out.print("Entre com o valor= " + " ");
            cotacaoDolar = leitor.nextDouble();

            for (int i=0; i<vetorA.length;i++){
                vetorA[i] = cotacaoDolar * (i+1);

        }

        System.out.println("Cotação Dólar");

        for (int i=0; i<vetorA.length; i++){
            System.out.println((vetorA[i]) + " ");
        }
        System.out.println();

    }
}

package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_22 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com a quantidades de CD's: ");
        int quantidade = leitor.nextInt();

        double valor;
        double soma =0;
        double media;
        for (int i=1; i<=quantidade; i++){
            System.out.print("Entre com o valor do Cd: " + i + " ");
            valor = leitor.nextDouble();

            soma +=valor;
        }
        media = soma/quantidade;
        System.out.println("Valor total gasto: " + soma);
        System.out.println("Média de valor por CD: " + media);
    }
}

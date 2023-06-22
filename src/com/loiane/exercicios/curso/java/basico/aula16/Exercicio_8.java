package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num =0;
        double media =0;
        double soma = 0;
        for(int i=0; i<5; i++){

            System.out.println("Digite um número: ");
            num = leitor.nextDouble();

            soma +=num;

        }
        media = soma/5;

        System.out.println("Soma " + soma);
        System.out.println("Media " + media);
    }
}

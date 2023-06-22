package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Número inteiro 1: ");
        int num1 = leitor.nextInt();

        System.out.println("Número inteiro 2: ");
        int num2 = leitor.nextInt();

        System.out.println("Número real: ");
        double num3 = leitor.nextDouble();

        int resulatdo1 = (num1 * 2) * (num2 /2);

        double resultado2 = (num1 * 3) + num3;

        double resultado3 = Math.pow (num3,3);

        System.out.println(resulatdo1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}

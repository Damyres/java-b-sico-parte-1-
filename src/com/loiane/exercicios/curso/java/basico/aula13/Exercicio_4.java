package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = leitor.nextDouble();

        System.out.println("Nota 4: ");
        double nota4 = leitor.nextDouble();


        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média final é: " + media);
    }
}

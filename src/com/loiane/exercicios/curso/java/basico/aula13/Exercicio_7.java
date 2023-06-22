package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é a area do quadrado? ");
        double lado = leitor.nextDouble();

        double area = Math.pow(lado, lado);

        System.out.println("A area do quadrado é: " + area);
        System.out.println("o dobro da area do quadrado é: " + (area * 2));
    }
}

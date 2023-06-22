package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de sorte: ");
        int numero = leitor.nextInt();

        System.out.println("Seu número de sorte é: " + numero );
    }
}

package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite um segundo número: ");
        int numero2 = leitor.nextInt();

        int  soma = numero1 + numero2;
        System.out.println("A soma dos números digitados é " + soma);


    }
}

package com.loiane.exercicios.curso.java.basico.aula16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        System.out.println("Entre com o primeiro número: ");
        num1 = leitor.nextInt();

        System.out.println("Entre com o segundo número: ");
        num2 = leitor.nextInt();

        for (int i=num1; i<num2; i++){
            System.out.print(" " + i);
        }

    }
}

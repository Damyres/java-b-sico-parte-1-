package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = leitor.nextInt();

        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i=num; i>0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado " + fatorial);
    }
}

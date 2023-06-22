package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com o n-ésmimo termo da série de Fibonacci: ");
        int n = leitor.nextInt();

        int primeiro =1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        for(int i=3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);

        }

    }
}

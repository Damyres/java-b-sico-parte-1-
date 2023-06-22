package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num= 0;
        System.out.print("Entre com o número para gerar a tabuada:");
        num = leitor.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }

    }
}

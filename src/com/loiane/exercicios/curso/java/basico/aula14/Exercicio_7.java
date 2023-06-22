package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = leitor.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("O número maior é: " + num1);
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("O número maior é: " + num2);
        } else {
            System.out.println("O número maior é: " + num3);
        }

        if(num1 <= num2 && num1 <= num3){
            System.out.println("O número menor é: " + num1);
        } else if(num2 <= num1 && num2 <= num3){
            System.out.println("O número menor é: " + num2);
        } else {
            System.out.println("O número menor é: " + num3);
        }
    }
}

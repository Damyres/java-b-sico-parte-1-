package com.loiane.exercicios.curso.java.basico.aula34;

import java.util.Scanner;

public class Exer_3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

       int num;

       do{
           System.out.println("Entre com um número positivo: ");
           num = leitor.nextInt();

           if(num < 0 ){
               System.out.println("Número inválido, entre novamente.");
           }

       } while (num < 0);

        System.out.println(Calculadora.fatorial(num));
    }
}

package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = leitor.nextInt();

        boolean primo = true;
        for(int i=2; i<num; i++){
            if(num % i ==0){
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
            }

        }
        if(primo){
            System.out.println("É número primo");
        }

    }
}

package com.loiane.exercicios.curso.java.basico.aula16;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num;
        int pares =0;
        int impares = 0;
        for(int i=0; i<10; i++){

            System.out.println("Digite um número: ");
            num = leitor.nextInt();

            if(num % 2==0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}

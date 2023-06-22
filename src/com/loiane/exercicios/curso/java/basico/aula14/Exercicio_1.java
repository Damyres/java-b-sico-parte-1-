package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 =leitor.nextInt();

        if(numero1 > numero2){
            System.out.print("Número maoir é "+ numero1);
        } else if (numero2 > numero1){
            System.out.println("Número maoir é "+ numero2);
        }
    }
}

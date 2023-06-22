package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] idades = new int [5];

        for (int i=0; i<idades.length; i++){
            System.out.print("Entre com um nome: " + i + " ");
            idades[i] = leitor.nextInt();
        }
        int contador=0;
        for (int i=0; i<idades.length; i++){
            if(idades[i] > 35){
                contador++;
            }

            }

        System.out.print("Quantidade de pessoas com a idade maior que 35 anos é: " + contador);
        System.out.println();

        System.out.print("Vetor A= ");
        for (int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }
    }
}

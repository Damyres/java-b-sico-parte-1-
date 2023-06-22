package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o número de notas: ");
        int notas = leitor.nextInt();

        double soma = 0;
        double media;
        double nota;
        for(int i=0; i<notas; i++){
            System.out.println("Entre com a nota: " + (i+1));
            nota = leitor.nextDouble();

            soma +=nota;

        }
        media = soma/notas;

        System.out.println("A soma: " + soma);
        System.out.println("A média: "+ media);
    }
}

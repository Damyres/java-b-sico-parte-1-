package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Convertendo metros em centimetros

        System.out.print("Insira a quantidade de metro ou metros: ");
        double metros = leitor.nextInt();

        double cm = (metros * 100);

        System.out.println("A quantidade de centimetros do valor do metro inserido é " + cm + " centímetros.");

    }
}

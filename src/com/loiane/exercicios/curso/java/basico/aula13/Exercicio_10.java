package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempcelsius = leitor.nextDouble();

        double conversao = (tempcelsius * 1.8) + 32;

        System.out.println("A temperatura em celsius é : " + conversao + "F");
    }
}

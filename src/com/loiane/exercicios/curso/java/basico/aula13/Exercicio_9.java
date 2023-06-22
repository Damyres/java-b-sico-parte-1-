package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Farenheit: ");
        double tempFarenheit = leitor.nextDouble();

        double conversao = (tempFarenheit - 32)/1.8;

        System.out.println("A temperatura em celsius é : " + conversao);




    }
}

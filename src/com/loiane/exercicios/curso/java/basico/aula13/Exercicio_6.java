package com.loiane.exercicios.curso.java.basico.aula13;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor do raio ?");
        double raio = leitor.nextDouble();

        double area = Math.PI * Math.pow  (raio,2);

        System.out.println("A area do círculo é: " + area + " cm.");






    }
}

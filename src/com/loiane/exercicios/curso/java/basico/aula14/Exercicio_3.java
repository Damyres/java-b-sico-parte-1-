package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma letra: (F ou M): ");
        String letra = leitor.next();



        if(letra.equalsIgnoreCase("M")){

            System.out.println("Sexo é masculino.");

        } else if (letra.equalsIgnoreCase("F")) {

            System.out.println("Sexo é feminino");
        } else {
            System.out.println("Sexo inválido");
        }


    }
}


package com.loiane.exercicios.curso.java.basico.aula16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com uma nota:");

        double nota = leitor.nextDouble();

        boolean notaValida = true;

        do{
            if(nota>=0 && nota <=10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente: ");
            }
        } while(!notaValida);

    }
}

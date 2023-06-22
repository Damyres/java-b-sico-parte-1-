package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("escolha o primeiro preço:  ");
        double p1 = leitor.nextDouble();

        System.out.println("escolha o segundo preço: ");
        double p2 = leitor.nextDouble();

        System.out.println("escolha o terceiro preço: ");
        double p3 = leitor.nextDouble();

        if(p1 <=p2 && p1 <=p3){
            System.out.println("O " + p1 + " é mais barato");

        } else if (p2 <= p1 && p2 <=p3){

            System.out.println("O " + p2 + " é mais barato");

        }else if(p3 <= p1 && p3<=p2){
            System.out.println("O " + p3 + " é mais barato");
        }
    }
}

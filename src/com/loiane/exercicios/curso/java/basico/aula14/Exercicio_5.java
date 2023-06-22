package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota : ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >=7 && media<=  9){
            System.out.println("Aprovado");
        } else if(media <=7){
            System.out.println("Reprovado");
        } else if(media == 10){
            System.out.println("Aprovado com Distinção");
        }
    }
}

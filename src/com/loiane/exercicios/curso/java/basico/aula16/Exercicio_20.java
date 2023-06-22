package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o número de idades: ");
        int idades = leitor.nextInt();


        int idade;
        double media;
        int soma = 0;
        for (int i = 0; i < idades; i++) {
            System.out.println("Entre com a idade: " + (i + 1));
            idade = leitor.nextInt();

            soma += idade;
        }
        media = soma / idades;
        if(media >=0 && media <= 25){
            System.out.println("A turma é jovem");
        }else if(media >= 26 && media <= 60){
            System.out.println("A turma é adulta");
        } else{
            System.out.println("A turma é idosa");
        }
        System.out.println("Média: " + media);
    }
}
package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o número de temperaturas: ");
        int temperaturas = leitor.nextInt();


        double soma=0;
        double media;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for(int i=1; i<=temperaturas; i++){
            System.out.println("Entre com a temperatura: " + i);
            double temperatura = leitor.nextDouble();

            soma += temperatura;
            if(temperatura > maior){
                maior = temperatura;
            }
            if(temperatura < menor){
                menor = temperatura;
            }


        }
        media = soma/temperaturas;
        System.out.println("Temperatura maior: " + maior);
        System.out.println("Temperatura menor: " + menor);
        System.out.println("A soma de todas as temperaturas é " + soma);
        System.out.println("A média das temperaturas é: " + media);
    }
}

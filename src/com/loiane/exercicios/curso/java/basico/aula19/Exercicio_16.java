package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [6];

        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com a posição " + i + " ");
            vetorA[i] = leitor.nextInt();
        }

        // a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        int somaMenor15 = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            }
        }

        // b) a quantidade de elementos armazenados no vetor que são iguais a 15;
        int countIgual15 = 0;
        for (int i=0; i<vetorA.length; i++){
            if(vetorA[i] == 15){
                countIgual15++;
            }
        }

        //c) a média dos elementos armazenados no vetor que são superiores a 15
        int countMaior15=0;
        double somaMaior15=0;
        for (int i=0; i<vetorA.length; i++){
            if(vetorA[i] > 15){
                countMaior15++;
                somaMaior15 += vetorA[i];
            }
        }

        double media = somaMaior15 / countMaior15;

        System.out.print("A soma dos vetores menores que 15 é: " + somaMenor15);
        System.out.println();
        System.out.print("A quantidade de números igual a 15 é: " + countIgual15);
        System.out.println();
        System.out.println("A média dos valores inseridos maior que 15 é: " + media);


        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
    }
}

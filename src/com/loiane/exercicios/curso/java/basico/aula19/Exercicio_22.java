package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_22 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[10];

        int qtd0 = 0;
        int qtd1 = 0;

        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 100);
            if(vetorA[i] == 0){
                qtd0++;
            } else{
                qtd1++;
            }
        }

        //10 - 100
        //qdt - x
        // x= (qtd *100) / vetorA.length
        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd1 * 100) / vetorA.length;

        System.out.println("porcetagem de 0= " + porc0);

        System.out.println("porcetagem de 1= " + porc1);

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

    }
}

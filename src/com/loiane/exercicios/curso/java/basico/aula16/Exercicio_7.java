package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        int list[] = {115,24,387,40,55};
//        int max = list[0];
//
//        for (int i=1; i < list.length; i++){
//            if(list[i] > max) {
//                max = list[i];
//            }
//        }
//
//        System.out.println(max);

        int num=0;
        int maior = Integer.MIN_VALUE;

        for (int i=0; i<5; i++){

            System.out.println("Entre com um número: ");
            num = leitor.nextInt();

            if(num > maior){
                maior = num;
                System.out.println("O número maior mudou " + maior);
            }
        }
        System.out.println("O maior número digitado foi " + maior);

    }
}

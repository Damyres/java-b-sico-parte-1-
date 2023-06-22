package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int popA = 80000;
        int popB = 200000;
        int count=0;

        while (popA <popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            count ++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:   "  + count);

    }
}

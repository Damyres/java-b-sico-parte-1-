package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int base =0;
        int pot =0;


        System.out.print("Entre com a base: ");
        base = leitor.nextInt();

        System.out.print("Entre com a potência: ");
        pot = leitor.nextInt();

        int resultado = base;
        for(int i=1; i<pot; i++){
            resultado *= base;
        }
        System.out.println("Resultado " + resultado);
        
    }
}

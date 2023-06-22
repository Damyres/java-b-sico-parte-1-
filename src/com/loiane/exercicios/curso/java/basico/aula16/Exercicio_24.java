package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {


        System.out.println("Preço do pão: 0.18");

        System.out.println("Preço do pão de ontem - Tabela de preços");

        for(int i=1; i<=50; i++){
            System.out.println(i + " -R$ " + (0.18 * i));

        }
    }
}

package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual turno você estuda? digite (M -matutino, V-vespertino, N-noturno)");
        String opcao = leitor.nextLine();

        if (opcao.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        }else if(opcao.equalsIgnoreCase("V")){
            System.out.println("Boa tarde!");
        }else if(opcao.equalsIgnoreCase("N")){
            System.out.println("Noturno!");
        } else {
            System.out.println("Letra inválida!");
        }


    }
}

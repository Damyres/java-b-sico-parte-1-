package com.loiane.exercicios.curso.java.basico.aula14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de sua preferência: ");
        int numero = leitor.nextInt();

        if(numero >=0){
            System.out.println("O número " + numero +  " é postivo ");
        } else {
            System.out.println("O número " + numero + " é negativo");
        }
    }
}

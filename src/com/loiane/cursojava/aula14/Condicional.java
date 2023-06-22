package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com a idade: ");
        int idade = leitor.nextInt();

        if(idade<=18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Pode entrar1");
        }
    }
}

package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = leitor.nextInt();

        System.out.print("Entre com um limite: ");
        int limite = leitor.nextInt();

        for(int i=numero; i<=limite; i++){
            System.out.println(i);

            if(i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}

package com.loiane.cursojava.aula11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);


        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);



    }
}

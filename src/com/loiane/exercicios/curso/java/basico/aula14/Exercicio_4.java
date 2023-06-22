package com.loiane.exercicios.curso.java.basico.aula14;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = leitor.nextLine();

       /* if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                ||letra.equalsIgnoreCase("u")){
            System.out.println("É vogal");
        } else{
            System.out.println("É consoante");
        }
        */
        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "I":
            case "O":
            case "U": System.out.println("É vogal"); break;
            default: System.out.println("É consoante");
        }
    }
}

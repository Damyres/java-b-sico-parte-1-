package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {

        Scanner leitor  = new Scanner(System.in);

        System.out.print("Entre com o número de pessoas que serão entrevistadas ");
        int numEntrevistados = leitor.nextInt();

        String [][] nomesFilhos = new String[numEntrevistados][];

        for (int i=0; i<nomesFilhos.length;i++){
            System.out.print("Entre com a quantidades de filhos ");
            int qtdFilhos = leitor.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j=0; j<nomesFilhos[i].length; j++){

                System.out.println("Digite o nome do filho " + (j+1));

                nomesFilhos[i][j] = leitor.next();
            }

        }

        System.out.println();
       for(int i=0; i<nomesFilhos.length; i++){
           System.out.println("Pessoa" + i + " tem " + nomesFilhos[i].length + " filhos");
           for(int j=0; j<nomesFilhos[i].length; j++){
               System.out.println(nomesFilhos[i][j]);
           }
       }
    }
}

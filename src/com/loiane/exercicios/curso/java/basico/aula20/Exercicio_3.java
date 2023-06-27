package com.loiane.exercicios.curso.java.basico.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for(int i=0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                System.out.print("Entre com valor da pos [" + i + "," + j + "]" + " ");
                matriz[i][j] = leitor.nextInt();
            }
        }
        int qtdPares=0;
        int qtdImpares= 0;
        for (int i =0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){
                    qtdPares++;
                }
                if(matriz[i][j] % 2 != 0){
                    qtdImpares++;
                }
            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de pares= " + qtdPares);
        System.out.println("Quantidade de ímpares= " + qtdImpares);
    }
}

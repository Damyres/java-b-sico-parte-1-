package com.loiane.exercicios.curso.java.basico.aula20;

import java.util.Random;

public class Exercicio_2 {
    public static void main(String[] args) {

        int [][] matrizAleatoria = new int[10][10];

        Random random = new Random();

        for(int i=0; i<matrizAleatoria.length; i++){
            for (int j =0; j<matrizAleatoria[i].length; j++){
                matrizAleatoria[i][j] = random.nextInt(100);
            }
        }
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 0;


        for(int i=0; i<matrizAleatoria[linha5].length; i++){
            for(int j=0; j<matrizAleatoria[i].length; j++){

                if(matrizAleatoria[linha5][j] > maiorL5){
                    maiorL5 = matrizAleatoria[linha5][j];

                }
                if (matrizAleatoria[linha5][j] < menorL5){
                    menorL5 = matrizAleatoria[linha5][j];
                }
            }
        }


        System.out.println("Matriz");

        for(int i=0; i < matrizAleatoria.length; i++){
            for (int j=0; j<matrizAleatoria[i].length; j++){
                System.out.print(matrizAleatoria[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maior valor da linha 5= " + maiorL5);
        System.out.println("Menor menor valor da linha 5= " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 =  0;

        for (int i=0; i<matrizAleatoria.length; i++){
            if(matrizAleatoria[i][col7] > maiorC7){
                maiorC7 = matrizAleatoria[i][col7];
            }
            if(matrizAleatoria[i][col7] < menorC7){
                menorC7 = matrizAleatoria[i][col7];
            }
        }

        System.out.println("Maior valor da coluna 7= " + maiorC7);
        System.out.println("Menor menor valor da coluna 7= " + menorC7);

    }
}

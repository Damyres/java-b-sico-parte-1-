package com.loiane.exercicios.curso.java.basico.aula20;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio_1 {
    public static void main(String[] args) {

//        double [][] matriz = new double [4][4];
//
//        DecimalFormat df = new DecimalFormat("##");
//        for (int i=0; i<matriz.length; i++){
//            for (int j=0; j<matriz[i].length; j++){
//               matriz[i][j] = Math.random() * 9;
//            }
//        }
//
//        for (int i=0; i<matriz.length; i++){
//            System.out.println();
//            for (int j=0; j<matriz[i].length; j++){
//                System.out.print(df.format(matriz[i][j]) + " ");
//            }
//        }

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
             }
            System.out.println();
             }
        System.out.println();
        System.out.println("Maior valor " + maior);
        System.out.println("Linha " + linha);
        System.out.println("Coluna " + coluna);
        }
    }
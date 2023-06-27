package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        int [] notas = new int [10];

        Random random = new Random();

        for (int i=0; i<notas.length; i++){
            notas[i] = random.nextInt(100);
        }
//
//        for (int i=0; i<notas.length; i++){
//            System.out.print(notas[i] + " ");
//        }
        System.out.println();
        System.out.println("Usando o ForEach");

        for (int nota : notas){
            System.out.print(nota + " ");
        }

        //Exemplo 2
        double [][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 4.5;
        notasAlunos[0][1] = 5.5;
        notasAlunos[0][2] = 10;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 5.5;
        notasAlunos[1][1] = 5.7;
        notasAlunos[1][2] = 5.3;
        notasAlunos[1][3] = 5.4;


        notasAlunos[2][0] = 5.6;
        notasAlunos[2][1] = 3.5;
        notasAlunos[2][2] = 8;
        notasAlunos[2][3] = 8;

        for( double [] notasAluno : notasAlunos){
            for(double nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}

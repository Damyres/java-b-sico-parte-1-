package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //double [][] notasAlunos = new double[3][4];

        double [][] notasAlunos = {{4.5,5.5, 10, 10}, {5.5,5.7,5.3,10}, {5.6,3.5,8,8}};

//        notasAlunos[0][0] = 4.5;
//        notasAlunos[0][1] = 5.5;
//        notasAlunos[0][2] = 10;
//        notasAlunos[0][3] = 10;
//
//        notasAlunos[1][0] = 5.5;
//        notasAlunos[1][1] = 5.7;
//        notasAlunos[1][2] = 5.3;
//        notasAlunos[1][3] = 5.4;
//
//
//        notasAlunos[2][0] = 5.6;
//        notasAlunos[2][1] = 3.5;
//        notasAlunos[2][2] = 8;
//        notasAlunos[2][3] = 8;



//        for(int i=0; i<notasAlunos.length; i++){
//            System.out.println("Entre com a nota= " + i);
//            notasAlunos[i][i] = leitor.nextDouble();
//
//        }

        System.out.println("Notas= ");
        for (int i=0; i<notasAlunos.length; i++){;
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " " + " - ");
            }
            System.out.println();
        }

        System.out.println();
        //alterando nota
        notasAlunos [1][3] = 0;

        System.out.println("Notas= ");
        for (int i=0; i<notasAlunos.length; i++){;
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " " + " - ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Caluculando a média= ");

        double soma;
        for (int i=0; i<notasAlunos.length; i++){

            soma =0;
            for (int j=0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("A média do aluno é " + i +  (soma/4));
        }

    }
}

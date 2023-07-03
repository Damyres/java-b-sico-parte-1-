package com.loiane.exercicios.curso.java.basico.aula25_26;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

//        System.out.print("Entre com nome do aluno: ");
//        aluno1.nome = leitor.next();

        System.out.print("Entre com o nome do curso: ");
        aluno1.nomeCurso = leitor.next();

        System.out.print("Entre com a matricula: ");
        aluno1.matricula = leitor.next();

        aluno1.nomeDisciplinas = new String [3];
         for(int i=0; i<aluno1.nomeDisciplinas.length; i++){
             System.out.print("Entre com o nome da disciplina: " + i + " ");
             aluno1.nomeDisciplinas[i] = leitor.next();
        }
         for (int i=0; i<aluno1.notasDisciplinas.length; i++){
             System.out.println("Obtendo notas das disciplina: " + aluno1.nomeDisciplinas[i]);
            for (int j=0; j<aluno1.notasDisciplinas[i].length; j++){
                System.out.print("Entre com a nota: " + (j+1) + " ");
                aluno1.notasDisciplinas[i][j] = leitor.nextDouble();
            }
         }
         System.out.println();
         aluno1.mostrarinfo();


    }

}

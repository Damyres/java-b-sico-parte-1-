package com.loiane.exercicios.curso.java.basico.aula25_27;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        Aluno aluno1 = new Aluno();

        System.out.print("Entre com o nome do curso: ");
        aluno1.setNomeCurso(leitor.next());

        System.out.print("Entre com a matricula: ");
        aluno1.setMatricula(leitor.next());

//        aluno1.nomeDisciplinas = new String [3];
        for(int i=0; i<aluno1.getNomeDisciplinas().length; i++){
            System.out.print("Entre com o nome da disciplina: " + i + " ");
            aluno1.setNomeDisciplinaPos(i, leitor.next()) ;
        }
        for (int i=0; i<aluno1.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas das disciplina: " + aluno1.getNomeDisciplinas()[i]);
            for (int j=0; j<aluno1.getNotasDisciplinas()[i].length; j++){
                System.out.print("Entre com a nota: " + (j+1) + " ");
                aluno1.setNomePosIJ(i,j,leitor.nextDouble());
            }
        }
        System.out.println();
        aluno1.mostrarinfo();

    }
}

package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com o número de turmas: ");
        int turmas = leitor.nextInt();


        int media;
        int soma = 0;
        int alunos;

        for (int i = 1; i <=turmas; i++) {

        boolean invalido = true;
        do{
            System.out.print("Entre com a quantidade de alunos: " + i + " ");
            alunos = leitor.nextInt();

            if(alunos <= 40){
                invalido = false;
            }else{
                System.out.println("Números de alunos inválidos., digite novamente. ");
            }
        } while(invalido);

        soma += alunos;
        }
        media = soma / turmas;

        System.out.println("Média de alunos por turma: " + media);
        System.out.println("Total de alunos: " + soma);
    }

}

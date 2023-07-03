package com.loiane.exercicios.curso.java.basico.aula25_26;

import org.w3c.dom.ls.LSOutput;

public class Aluno {

    private String nome;
    String matricula;
    String nomeCurso;
    String [] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    boolean aprovado;

//    public Aluno(String nome, String matricula, String nomeCurso){
//        this.nome = nome;
//        this.matricula = matricula;
//        this.nomeCurso= nomeCurso;
//    }



    public boolean verificarAprovacao(int indice){
        double soma = 0;
       for(int i=0; i<notasDisciplinas[indice].length; i++){
           soma += notasDisciplinas[indice][i];
        }
       double media = soma/4;
       if(media >=7){
        return  true;
       }
        return false;

    }
    public void exibirDisciplina(){

    }
    public void exibirNotas (){
       for(int i=0; i<notasDisciplinas.length; i++){
           for (int j=0; j < notasDisciplinas[i].length; j++){
               System.out.println(notasDisciplinas[i][j]);
           }
       }
    }

    public void mostrarinfo (){
        System.out.println("Nome: " + this.nome );
        System.out.println("Matricula: " +  this.matricula);
        System.out.println("Curso: " + this.nomeCurso);
        System.out.println();

        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for(int j=0; j<notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

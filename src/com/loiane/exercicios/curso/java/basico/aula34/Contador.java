package com.loiane.exercicios.curso.java.basico.aula34;

public class Contador {

    private static int count;

    public Contador(){
        count++;
    }

    public static void incrementar(){
        count++;
    }

    public static void zerar(){
        count =0;
    }

    public static int obterValor(){
        return count;
    }



}

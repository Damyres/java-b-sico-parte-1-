package com.loiane.exercicios.curso.java.basico.aula34;

import java.util.concurrent.Callable;

public class Exer_01 {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {

        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();


//        imprimirValor();
//
//        Contador.zerar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();


    }

}

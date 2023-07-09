package com.loiane.exercicios.curso.java.basico.aula34;

public class Exer_02 {

    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(1,2));

        imprimirTela(Calculadora.subtrair(10,3));

        imprimirTela(Calculadora.multiplicar(2,2));

        imprimirTela(Calculadora.divividir(5,2));

        imprimirTela(Calculadora.elevarPotencia(2,2));


    }

    public static void imprimirTela(int num){
        System.out.println(num);
    }
}

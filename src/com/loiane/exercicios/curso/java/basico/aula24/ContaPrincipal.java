package com.loiane.exercicios.curso.java.basico.aula24;

public class ContaPrincipal {
    public static void main(String[] args) {

//        int numero;
//        double saldo;
//        boolean especial;
//        double limite;

        Conta corrente = new Conta();

        corrente.numero = 1234;
        corrente.saldo = 1500.00;
        corrente.especial = true;
        corrente.limite = 5000.00;

        System.out.println("Número: " + corrente.numero);
        System.out.println("Saldo: " + corrente.saldo);
        System.out.println("Conta especial: " + corrente.especial);
        System.out.println("Limite: " + corrente.limite);


    }
}

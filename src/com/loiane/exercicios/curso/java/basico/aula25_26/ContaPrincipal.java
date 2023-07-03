package com.loiane.exercicios.curso.java.basico.aula25_26;

public class ContaPrincipal {
    public static void main(String[] args) {

        Conta corrente = new Conta(12345, 1000, true, 2000, 0, 2000);
//        System.out.println(corrente.verificarEspecial());
        System.out.println("Saldo: " + corrente.consultarSaldo());
        System.out.println(corrente.sacar(200));

        System.out.println("Saldo: " + corrente.consultarSaldo());
        System.out.println(corrente.sacar(1200));

        System.out.println("Saldo: " + corrente.consultarSaldo());
        corrente.depositar(700);

        System.out.println(corrente.verificarUsoChequeEspecial());

        System.out.println("Saldo: " + corrente.consultarSaldo());
        System.out.println(corrente.sacar(1500));

        System.out.println("Conta é especial ou não " + corrente.verificarUsoChequeEspecial());

        System.out.println("Saldo: " + corrente.consultarSaldo());
    }
}

package com.loiane.exercicios.curso.java.basico.aula25_27;

public class Exercicio_2 {
    public static void main(String[] args) {

//
//        Conta corrente = new Conta(123,-2000.00,true,1000.00,500,1.000);
//
//        System.out.println("Saldo: " + corrente.getSaldo());
//        System.out.println("Saque: " + corrente.sacar(500));
//
//        System.out.println("Saldo: " + corrente.getSaldo());
//
//        System.out.println("Limite especial: " + corrente.getLimite());
//
//        System.out.println("Saque: " + corrente.sacar(1500));
//        System.out.println("Saldo: " + corrente.getSaldo());
//
//        System.out.println("Limite especial: " + corrente.getLimite());
//
//        System.out.println("Saque: " + corrente.sacar(500));
//
//        System.out.println("Limite especial: " + corrente.getLimite());
//
//
//        System.out.println("Limite especial saque: " + corrente.isEspecial());

        Conta poupanca = new Conta();
        poupanca.setNumero(123);
        poupanca.setSaldo(-100);
        poupanca.setEspecial(true);
        poupanca.setLimite(200);
        poupanca.setValorEspecialUsado(20);
        poupanca.sacar(200);


        System.out.println("Conta número: " + poupanca.getNumero() + "\n" + "Saldo: " + poupanca.getSaldo() + "\n"
                + "Especial: " + poupanca.isEspecial() + "\n" + "Limite: " + poupanca.getLimite() +  "\n" + "Valor especial: " + poupanca.getValorEspecialUsado());


        System.out.println( poupanca.sacar(200));







//        System.out.println(corrente.toString());


    }
}

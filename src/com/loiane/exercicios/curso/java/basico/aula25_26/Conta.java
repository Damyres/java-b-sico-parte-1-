package com.loiane.exercicios.curso.java.basico.aula25_26;

public class Conta {

    int numero;
    double saldo;
    boolean especial;
    double limite;
    double valorEspecialUsado;
    double limiteEspecial;

    Conta(int numero, double saldo, boolean especial, double limite, double valorEspecialusado, double limiteEspecial) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.valorEspecialUsado = valorEspecialusado;
        this.limiteEspecial = limiteEspecial;
    }

    //saldo, valor
    public String sacar(double quantiaASacar) {

        if (saldo >= quantiaASacar) {
            this.saldo -= quantiaASacar;
            return "Saque realizado com sucesso!";
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return "Saque realizado com sucesso!";
                } else {
                    return "Não foi possível efetuar o saque, saldo insuficiente.";
                }
            } else {
                return "Não foi possível efetuar o saque, saldo insuficiente.";
            }
        }
    }

    public double depositar(double valorDepositado){
        return this.saldo += valorDepositado;
    }

    public double consultarSaldo(){
        return this.saldo = saldo;
    }
    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }


    public String toString (){
       return "Número: " + this.numero +  "\n" +
               "Saldo: " +  this.saldo + "\n" +
               "Esbecial: " + this.especial +  "\n" +
               "Limite: " + this.limite + "\n" +
               "Valor especial usado: " + this.valorEspecialUsado + "\n" +
               "Limite especial: " + this.limiteEspecial;

    }
}

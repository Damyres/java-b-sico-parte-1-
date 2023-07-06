package com.loiane.exercicios.curso.java.basico.aula25_27;

public class Conta {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    private double valorEspecialUsado;
    private double limiteEspecial;

    public Conta(){

    }
//    public Conta (double saldo){
//        this.saldo = saldo;
//    }
    public Conta(int numero, double saldo, boolean especial, double limite, double valorEspecialUsado, double limiteEspecial){
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.valorEspecialUsado = valorEspecialUsado;
        this.limiteEspecial = limiteEspecial;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public boolean isEspecial(){

        return this.especial;
    }
    public void setEspecial(boolean especial){

        this.especial = especial;
    }
    public double getLimite(){

        return this.limite;
    }
    public void setLimite(double limite){

        this.limite = limite;
    }
    public double getValorEspecialUsado(){

        return this.valorEspecialUsado;
    }
    public void setValorEspecialUsado(double valorEspecial){
        this.valorEspecialUsado = valorEspecialUsado;
    }
    public double getLimiteEspecial(){
        return this.limiteEspecial;
    }
    public void setLimiteEspecial(double limiteEspecial){

        this.limiteEspecial = limiteEspecial;
    }
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

    public double depositar (double valorDepositado){
        return this.saldo += valorDepositado;
    }
    public double consultarSaldo(){
        return this.saldo = saldo;
    }
    public boolean  verificarUsoChequeEspecial (){
        return this.saldo < 0;

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

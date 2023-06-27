package com.loiane.cursojava.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(){

    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros= numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    public String toString(){
        return "Marca: " + this.marca + "\n" + "Modelo: " + this.modelo + "\n"
                + "Número de passageiros: " + this.numPassageiros + "\n"
                + "Capacidade de combustível: " + this.capCombustivel + "\n"
                + "Consumo de combustível: " + this.consumoCombustivel;
    }
}

package com.loiane.cursojava.aula32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public Carro(){

    }

    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;

    }

    //obter retono
    public String getMarca(){
        return this.marca;
    }
    //setar valor

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel(){
        return this.capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel(){
        return this.consumoCombustivel;
    }
    public void setConsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
    }
}

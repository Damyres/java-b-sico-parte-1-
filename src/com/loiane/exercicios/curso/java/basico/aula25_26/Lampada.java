package com.loiane.exercicios.curso.java.basico.aula25_26;

public class Lampada {

    String marca;
    String modelo;
    String fonteEnergia;

    String cor;
    double preco;

    boolean ligado;


    public Lampada(){

    }

    public Lampada (String marca, String modelo, String fonteEnergia, String cor, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.fonteEnergia = fonteEnergia;
        this.cor = cor;
        this.preco = preco;
    }

    public Lampada (String marca, String modelo, String fonteEnergia, String cor, double preco, boolean ligado){
        this.marca = marca;
        this.modelo = modelo;
        this.fonteEnergia = fonteEnergia;
        this.cor = cor;
        this.preco = preco;
        this.ligado = ligado;
    }

    public void ligarLampada(){
        this.ligado = true;
    }

    public void desligarLampada(){
        this.ligado = false;
    }

    public void lampidaEstaLigada (){
        if(ligado){
            System.out.println("Lampada ligada!");
            System.out.println("Entrou na condição");
        }else {
            System.out.println("Lampada desligada.");
            System.out.println("Entrou na condição");
        }
    }

    public String toString(){
        return "Marca: " + this.marca + "\n" +
               "Modelo: " + this.modelo + "\n" +
                "Fonte de energia: " + this.fonteEnergia + "\n" +
                "Cor: " + this.cor + "\n" +
                "Preço: " + this.preco;
    }
}

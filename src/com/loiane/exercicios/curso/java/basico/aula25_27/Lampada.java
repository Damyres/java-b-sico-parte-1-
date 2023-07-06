package com.loiane.exercicios.curso.java.basico.aula25_27;

public class Lampada {
    private String marca;
    private String modelo;
    private String fonteEnergia;

    private String cor;
    private double preco;

    private boolean ligado;

    public Lampada(){

    }

    public Lampada (String marca, String modelo, String fonteEnergia, String cor, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.fonteEnergia = fonteEnergia;
        this.cor = cor;
        this.preco = preco;

    }
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getFonteEnergia(){
        return this.fonteEnergia;
    }
    public void setFonteEnergia(String fonteEnergia){
        this.fonteEnergia = fonteEnergia;
    }
    public String getCor(){
        return  this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void ligarLampada(){
        this.ligado = true;
        System.out.println("Lampada ligada!");
    }
    public void desligarLampada(){
        this.ligado = false;
        System.out.println("Lampada desligada.");
    }

    public void lampadaLigada(){
        if(isLigado()){
            System.out.println("Lampada ligada!");
            System.out.println("Entrou na condição");
        } else {
            System.out.println("Lampada desligada.");
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

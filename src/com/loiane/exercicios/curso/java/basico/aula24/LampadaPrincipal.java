package com.loiane.exercicios.curso.java.basico.aula24;

public class LampadaPrincipal {
    public static void main(String[] args) {

//        String fabricante;
//        int numeroPeca;
//        String cor;
//        String tipoDeEnergia;
//        double peso;
//        String marca;

        Lampada led = new Lampada();

        led.fabricante = "Brasilux";
        led.numeroPeca  = 1333434;
        led.cor = "Branca";
        led.tipoDeEnergia = "Energia elétrica";
        led.peso = 2.45;
        led.marca = "Taschinra";

//        led.marca = new String[];

        System.out.println("Fabricante: " + led.fabricante);
        System.out.println("Número de peças:" + led.numeroPeca);
        System.out.println("Cor: " + led.cor);
        System.out.println("Tipo de energia: " + led.tipoDeEnergia);
        System.out.println("Peso: " + led.peso);
        System.out.println("Marca: " + led.marca);

        System.out.println();

        Lampada amarela = new Lampada();

        amarela.fabricante = "Geonav";
        amarela.numeroPeca  = 458;
        amarela.cor = "Branco frio, branco quente";
        amarela.tipoDeEnergia = "Energia elétrica";
        amarela.peso = 100;
        amarela.marca = "Geonav";
        System.out.println();

        System.out.println("Fabricante: " + amarela.fabricante);
        System.out.println("Número de peças:" + amarela.numeroPeca);
        System.out.println("Cor: " + amarela.cor);
        System.out.println("Tipo de energia: " + amarela.tipoDeEnergia);
        System.out.println("Peso: " + amarela.peso);
        System.out.println("Marca: " + amarela.marca);







    }
}

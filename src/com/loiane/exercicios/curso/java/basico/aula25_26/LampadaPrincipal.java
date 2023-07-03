package com.loiane.exercicios.curso.java.basico.aula25_26;

public class LampadaPrincipal {

    public static void main(String[] args) {


        Lampada led = new Lampada ("Azul", "Led", "Elétrica", "Branca", 2.56);
//
//        led.ligarLampada();
//        led.lampidaEstaLigada();

        led.desligarLampada();
        led.lampidaEstaLigada();
        System.out.println(led.toString());
    }
}

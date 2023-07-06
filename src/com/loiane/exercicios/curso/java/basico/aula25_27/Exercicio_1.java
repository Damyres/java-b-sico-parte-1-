package com.loiane.exercicios.curso.java.basico.aula25_27;

public class Exercicio_1 {

    public static void main(String[] args) {

        Lampada led = new Lampada("qjl", "Led", "eletrica", "branca", 2.56);

//        led.ligarLampada();
//
        led.desligarLampada();

        led.lampadaLigada();

        System.out.println(led.toString());

    }

}

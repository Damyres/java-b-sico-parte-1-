package com.loiane.cursojava.aula24;

import java.util.Scanner;

public class PrincipalCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 20;
        van.capCombustivel = 34;
        van.consumoCombustivel = 1;

        System.out.println("Marca= " +van.marca);
        System.out.println("Modelo= " + van.modelo);
        System.out.println("Número de passageiros= " + van.numPassageiros);

        System.out.println();

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;

        System.out.println("Marca= " + fusca.marca);
        System.out.println("Modelo= " + fusca.modelo);
        System.out.println("Número de passageiros= " + fusca.numPassageiros);
        System.out.println("Capacidade de combustivel= " + fusca.capCombustivel);

    }
}

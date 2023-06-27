package com.loiane.cursojava.aula25;

public class PrincipalCarro {
    public static void main(String[] args) {

        //    String marca;
//    String modelo;
//    int numPassageiros;
//    double capaCombustivel;
//    double consumoCombustivel;

        Carro van = new Carro();

//        van.marca = "Fiat";
//        van.modelo = "Ducato";
//        van.numPassageiros = 20;
//        van.capCombustivel = 34;
//        van.consumoCombustivel = 1;

        van.exibirAutonomia();

        System.out.println();

        Carro combi =  new Carro("Volkswagen", "Kombi", 12, 60, 18);
        combi.exibirAutonomia();
        System.out.println(combi.toString());

    }

}

package com.loiane.cursojava.aula26;

public class PrincipalCarro {
    public static void main(String[] args) {

//        String modelo;
//        int numPassageiros;
//        double capCombustivel;
//        double consumoCombustivel;

        Carro picap = new Carro("Chevrolet", "Montana", 20, 60, 30);
        picap.exibirAutonomia();
        System.out.println("Método obter autonomia foi chamado! " + picap.obterAutonomia());
        System.out.println(picap.toString());
        System.out.println();


        Carro esportivo = new Carro("Camaro","Chevrolet", 6, 70, 10);
        esportivo.exibirAutonomia();
        esportivo.obterAutonomia();
        System.out.println(esportivo.toString());
        System.out.println();

        Carro crossovers = new Carro("Chevrolet", "Tracker", 6, 80,20 );
        crossovers.exibirAutonomia();
        crossovers.obterAutonomia();
        System.out.println(crossovers.toString());
        System.out.println();

        Carro carros = new Carro("Chevrolet", "Onix", 4,50,10);
        carros.exibirAutonomia();
        carros.obterAutonomia();
        System.out.println(carros.toString());
        System.out.println();


        Carro eletricos = new Carro("Chevrolet", "Bolt EV", 4, 50,12);
        eletricos.obterAutonomia();
        eletricos.exibirAutonomia();
        System.out.println(eletricos.toString());
        System.out.println();


    }
}

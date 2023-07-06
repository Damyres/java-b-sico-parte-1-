package com.loiane.cursojava.aula32;

public class CarroPrincipal {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.setMarca("Fiat");

        Carro fusca = new Carro("Fiat", "20202", 10);
        fusca.setMarca("kombi");

        System.out.println(van.getMarca());
        System.out.println(fusca.getMarca());
    }
}

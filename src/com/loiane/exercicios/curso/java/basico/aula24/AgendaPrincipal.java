package com.loiane.exercicios.curso.java.basico.aula24;

public class AgendaPrincipal {
    public static void main(String[] args) {

        Agenda ag = new Agenda();
//
//        String nome;
//        int numero;
//        String email;
//        String endereco;

//        ag.numero = new String[3];

       ag.nome = "Luiz";
        ag.numero = "555-66698";
        ag.email = "email@.com";
        ag.endereco = "Rua - Oliveira Paiva, N° 200, Bairro: Onorío de Freitas.";

        System.out.println("Nome: " + ag.nome);
        System.out.println("Número: " + ag.numero);
        System.out.println("Email: " + ag.email);
        System.out.println("Endereço: " + ag.endereco);
    }
}

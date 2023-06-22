package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean informacoesValidas = false;
        String nomeUser;
        String senha;

        do{
            System.out.print("Digite seu nome: ");
            nomeUser = leitor.nextLine();

            System.out.print("Digite sua senha: ");
            senha = leitor.nextLine();

            if(nomeUser.equalsIgnoreCase(senha)) {
               informacoesValidas = false;
                System.out.println("Senha igual ao usuário, digite novamente");
            } else{
                informacoesValidas = true;
                System.out.println("Senha e usuário válido");
            }

        } while(!informacoesValidas);

    }
}

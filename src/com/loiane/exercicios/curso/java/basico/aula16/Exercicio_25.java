package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        boolean sair= true;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;

        do{
            System.out.println("Deseja informar uma nova compra? S/N ");
            continuarCompra = leitor.next();

            if(continuarCompra.equalsIgnoreCase("S")){
                System.out.println("Digite a quantidade de produtos da compra: ");
                qtdProdutos = leitor.nextInt();

                total = 0;

                for(int i=1; i<qtdProdutos; i++){
                    System.out.println("Informe preço do prodtuo: " + i);
                    preco = leitor.nextDouble();


                }


            } else {
                sair = true;
            }

        } while(!sair);
        
    }
}

package com.loiane.exercicios.curso.java.basico.aula16;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean infoValida = false;

        do{
            System.out.print("Digite o seu nome: ");
            nome = leitor.nextLine();
            if(nome.length() > 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa no minino três caracteres");
            }
            } while(!infoValida);

           do{
             System.out.print("Digite sua idade: ");
             idade = leitor.nextInt();
             if(idade >=0 &&idade <= 150){
                 infoValida = true;
               } else {
                 System.out.println("Sua idade precisa ser entre 0 e 150 anos");
             }

           } while (!infoValida);

           do {
               System.out.print("Digite seu salário: ");
               salario = leitor.nextDouble();
               if(salario >= 0){
                   infoValida = true;
               } else{
                   System.out.println("Seu salario precsar ser maior que 0");
               }

           } while (!infoValida);

           infoValida = false;
           do{
               System.out.print("Digite seu sexo: ");
               sexo = leitor.nextLine();
               if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                   infoValida = true;
               } else {
                   System.out.println("Sexo precisa ser 'F' ou 'M'");
               }

           }while (!infoValida);

           do{
               System.out.print("Digite seu estado civil:  's'-solteiro, 'c -casado, 'v'-viúvo, 'd'-divorciado");
               estadoCivil = leitor.nextLine();
               if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
               || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                   infoValida = true;
               } else {
                   System.out.println("Informação inválida!");
               }
           } while (!infoValida);
    }
}

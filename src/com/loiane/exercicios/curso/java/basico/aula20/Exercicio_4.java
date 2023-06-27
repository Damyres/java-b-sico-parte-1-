package com.loiane.exercicios.curso.java.basico.aula20;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String [][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;

        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso. ");
            System.out.println("Digite 2 para verificar compromisso. ");
            System.out.println("Digite 0 para sair. ");
            opcao = leitor.nextByte();

            if(opcao == 1){ //adiciona compromisso

                boolean diaValido = false;
                int dia = 0;

                while(!diaValido){
                    System.out.println("Entre com o dias do mês: ");
                     dia = leitor.nextInt();
                     if(dia > 0 && dia <= 31){
                         diaValido = true;
                     } else {
                         System.out.println("Dia inválido, digite novamente; ");
                     }
                }
                boolean horaValido = false;
                int hora = 0;
                while(!horaValido){
                    System.out.println("Entre com a hora do compromisso ");
                    hora = leitor.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso; ");
                compromissos[dia][hora] = leitor.next();

            } else if (opcao == 2){ //verifica compromisso

                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Entre com o dias do mês: ");
                    dia = leitor.nextInt();
                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente; ");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while(!horaValido){
                    System.out.println("Entre com a hora do compromisso ");
                    hora = leitor.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("O compromisso nagendado é: ");
                System.out.println(compromissos[dia][hora]);

            } else if (opcao == 0){ //sair
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente. ");
            }
        }
    }
}

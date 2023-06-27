package com.loiane.exercicios.curso.java.basico.aula20;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);
        String [][][] compromissos = new String[12][31][8];

        boolean sair = false;
        byte opcao;

        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso. ");
            System.out.println("Digite 2 para verificar compromisso. ");
            System.out.println("Digite 0 para sair. ");

            opcao = leitor.nextByte();

            if(opcao == 1){ //adiciona compromisso

                boolean mesValido = false;
                int mes = 0;

                while(!mesValido){
                    System.out.println("Entre com o mês: ");
                    mes = leitor.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente; ");
                    }
                }

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
                    if(hora >= 0 && hora <= 8){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                mes--;
                dia--;
                System.out.println("Digite o compromisso; ");
                compromissos[mes][dia][hora] = leitor.next();

            } else if (opcao == 2){ //verifica compromisso

                boolean mesValido = false;
                int mes = 0;

                while(!mesValido){
                    System.out.println("Entre com o mês: ");
                    mes = leitor.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente; ");
                    }
                }


                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Entre com o dia do mês: ");
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
                mes--;
                dia--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[mes][dia][hora]);

            } else if (opcao == 0){ //sair
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente. ");
            }
        }
    }
}

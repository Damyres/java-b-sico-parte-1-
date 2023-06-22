package com.loiane.exercicios.curso.java.basico.aula13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        System.out.println("Qual o valor da hora? ");
        double valorHora = leitor.nextDouble();

        System.out.println("Quantidade de horas trablhadas no mês?");
        double qtdHorasMensal = leitor.nextDouble();

        double valorSalario = qtdHorasMensal * valorHora;
        System.out.println("Salário mensal é: " + valorSalario);

    }
}

package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] idades = new int [10];

        for(int i=0; i<idades.length; i++){
            System.out.print("Entre com a idade: " + (i+1) + " ");
            idades[i] = leitor.nextInt();
        }
//        int menor = 0;
//        int maior = 0;
        int menor = idades[0];
        int indexMenor =0;
        int maior = idades[0];
        int indexMaior =0;

        for (int i=1; i<idades.length; i++){
            if(idades[i] > maior){
               maior =  idades[i];
               indexMaior = i;
            } else if(idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.print("Idade maior digitada é: " + maior);
        System.out.println();
        System.out.print("Posição maior: " + indexMaior);
        System.out.println();
        System.out.print("Idade menor digitada é: " + menor);
        System.out.println();
        System.out.print("Posição maior: " + indexMenor);
        System.out.println();

        System.out.print("Idades: ");
        for (int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }
    }
}

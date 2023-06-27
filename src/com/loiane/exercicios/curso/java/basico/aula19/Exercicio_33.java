package com.loiane.exercicios.curso.java.basico.aula19;

import java.util.Scanner;

public class Exercicio_33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int [10];

        boolean primo = true;
        String msg = " ";
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com um número para a posição A " + (i+1) + " ");
            vetorA[i] = leitor.nextInt();
        }

        primo = true;
        for(int i=0; i<vetorA.length; i++){

            for (int j=2; j<vetorA[i]; j++){
                if(vetorA[i] % j == 0){
                   primo = false;
                   break;
                }
            }
            msg = " ";
            if(primo){
                msg = " primo";
            } else {
                msg = " não é primo";
            }
            System.out.println(vetorA[i] + msg);
        }
    }
}

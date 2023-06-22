package com.loiane.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

        double [] temperaturas= new double[365];

        temperaturas [0] = 32.3;
        temperaturas [1] = 30.1;
        temperaturas [2] = 33;
        temperaturas [3] = 34.5;
        temperaturas [4] = 29.6;

        System.out.println("O valor da temperatura do dia 2 é: " + temperaturas[0] );

        System.out.println("O tamanho do array é " + temperaturas.length);

        //imprimindo o array por completo

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]) ;
        }

        for(double temp: temperaturas){
            System.out.println("For melhorado " + temp);
        }

    }

}

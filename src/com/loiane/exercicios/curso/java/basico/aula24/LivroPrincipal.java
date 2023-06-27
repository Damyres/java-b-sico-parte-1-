package com.loiane.exercicios.curso.java.basico.aula24;

import java.util.Date;

public class LivroPrincipal {

    public static void main(String[] args) {

//        String editora;
//        String idioma;
//        int idadeLeitura;
//        int anoLancamento;

        Livro livroInfantil = new Livro();

        livroInfantil.editora = "HarperCollins";
        livroInfantil.idioma = "Português";
        livroInfantil.idadeLeitura = 15;
        livroInfantil.anoLancamento = 2017;

        System.out.println("Editora:" + livroInfantil.editora);
        System.out.println("idioma: " + livroInfantil.idioma);
        System.out.println("Idade recomendada: " + livroInfantil.idadeLeitura);
        System.out.println("Ano de lançamento: " + livroInfantil.anoLancamento);


        Livro gibi = new Livro();

        gibi.editora = "Ciranda Cultural";
        gibi.idioma = "Português";
        gibi.idadeLeitura = 33;
        gibi.anoLancamento = 2021;

        System.out.println("Editora:" + gibi.editora);
        System.out.println("idioma: " + gibi.idioma);
        System.out.println("Idade recomendada: " + gibi.idadeLeitura);
        System.out.println("Ano de lançamento: " + gibi.anoLancamento);
    }

}

package com.loiane.exercicios.curso.java.basico.aula24;

import java.util.Date;

public class LivroLivrariaPrincipal {

    public static void main(String[] args) {
//        String titulo;
//        String id;
//        boolean compra;
//        int anoLancamento;
//        boolean disponibilidadeAluguel;


        LivroLivraria livros = new LivroLivraria();

        livros.letraInical = "A";
        livros.id = "133";
        livros.compra = false;
        livros.anoLancamento = new Date();
        livros.disponibilidadeAluguel = true;

        System.out.println("Letra inicial do acervo: " + livros.letraInical);
        System.out.println("Id do livro: " + livros.id);
        System.out.println("Está disponivel para compra? " + livros.compra);
        System.out.println("Ano de lançamento: " + livros.anoLancamento);
        System.out.println("Disponível para aluguel? " + livros.disponibilidadeAluguel);

    }
}

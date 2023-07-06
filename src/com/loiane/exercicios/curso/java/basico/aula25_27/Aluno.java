package com.loiane.exercicios.curso.java.basico.aula25_27;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String [] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno(){
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getNomeCurso(){
        return  this.nomeCurso;
    }
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public String [] getNomeDisciplinas(){
        return this.nomeDisciplinas;
    }
    public void setNomeDisciplinas(String[] nomeDisciplinas){
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }
    public void  setNotasDisciplinas (double[][] notasDisciplinas){
        this.notasDisciplinas = notasDisciplinas;
    }

    public boolean verificarAprovacao(int indice){
        double soma = 0;
        for(int i=0; i<notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma/4;
        if(media >=7){
            return  true;
        }
        return false;

    }
    public void exibirDisciplina(){

    }
    public void exibirNotas (){
        for(int i=0; i<notasDisciplinas.length; i++){
            for (int j=0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j]);
            }
        }
    }

    public void mostrarinfo () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.nomeCurso);
        System.out.println();

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }

}

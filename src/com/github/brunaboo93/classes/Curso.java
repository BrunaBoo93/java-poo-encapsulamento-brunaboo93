package com.github.brunaboo93.classes;

public class Curso {
    private String nome;
    private String professor;
    private String tema;
    private Double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) throws Exception{
        if(valor < 0 || valor > 1000 || valor == 0){
            throw new Exception("Insira um número maior que 0 e menor que 1000");
        }
        else{
            this.valor = valor;
        }

    }
}



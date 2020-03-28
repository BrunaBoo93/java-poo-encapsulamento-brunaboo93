package com.github.brunaboo93.main;

import com.github.brunaboo93.classes.Curso;

public class Programa {
    public static void main(String[] args) {
        try {
            Curso curso = new Curso();
            curso.setNome("Lucas Silva");
            curso.setProfessor("Joao Souza");
            curso.setTema("ADS");
            curso.setValor(-20d);

            System.out.println(String.format("Olá: %s \n" +
                    "Seu professor será: %s \n" +
                    "O curso em que está inscrito é: %s \n" +
                    "O valor do curso é: %.2f \n", curso.getNome(), curso.getProfessor(), curso.getTema(), curso.getValor()));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

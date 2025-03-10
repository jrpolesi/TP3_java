package com.jrpolesi.exercicio10;

public class Exercicio10 {
    public static void execute() {
        final Circulo circulo = new Circulo(10);
        System.out.println("Raio do círculo: " + circulo.getRaio());

        final Esfera esfera = new Esfera(5.5);
        System.out.println("Raio da esfera: " + esfera.getRaio());
    }
}

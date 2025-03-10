package com.jrpolesi.exercicio11;

public class Exercicio11 {
    public static void execute() {
        final Circulo circulo = new Circulo(10);
        final double areaDoCirculo = circulo.calcularArea();

        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.printf("Área do círculo: %.2f\n", areaDoCirculo);

        final Esfera esfera = new Esfera(5.5);
        final double volumeDaEsfera = esfera.calcularVolume();

        System.out.println("Raio da esfera: " + esfera.getRaio());
        System.out.printf("Volume da esfera: %.2f\n", volumeDaEsfera);
    }
}

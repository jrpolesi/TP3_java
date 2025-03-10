package com.jrpolesi.exercicio12;

public class Exercicio12 {
    public static void execute() {
        final Circulo circulo = new Circulo(3.0);
        final Esfera esfera = new Esfera(5.0);

        final double areaDoCirculo = circulo.calcularArea();
        final double volumeDaEsfera = esfera.calcularVolume();

        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.printf("Área do círculo: %.2f\n", areaDoCirculo);

        System.out.println("Raio da esfera: " + esfera.getRaio());
        System.out.printf("Volume da esfera: %.2f\n", volumeDaEsfera);
    }
}

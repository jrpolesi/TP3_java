package com.jrpolesi.exercicio11;

public class Circulo {
    /**
     * Raio do círculo, é necessário pois a partir dele é possível calcular a área do círculo usando a fórmula (π * r²).
     */
    private final double raio;

    public Circulo(final double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }
}

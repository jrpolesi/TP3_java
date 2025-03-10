package com.jrpolesi.exercicio11;

public class Esfera {
    /**
     * Raio da esfera, é necessário pois a partir dele é possível calcular o volume da esfera usando a fórmula (4/3 * π * r³).
     */
    private final double raio;

    public Esfera(final double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (this.raio * this.raio * this.raio);
    }
}

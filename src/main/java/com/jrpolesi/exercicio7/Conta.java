package com.jrpolesi.exercicio7;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private final String dataAbertura;

    public Conta(final String titular, final int numero, final String agencia, final double saldo, final String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getDataAbertura() {
        return this.dataAbertura;
    }
}

package com.jrpolesi.exercicio9;

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

    public void saca(final double valor) {
        this.saldo -= valor;
    }

    public void deposita(final double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }
}

package com.jrpolesi.exercicio7;

import java.util.Date;

public class Exercicio7 {
    public static void execute() {
        Conta conta = new Conta(
                "João",
                123,
                "20",
                1057.50,
                "01/01/2025"
        );

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Data de abertura: " + conta.getDataAbertura());
    }
}

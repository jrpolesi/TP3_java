package com.jrpolesi.exercicio9;

public class Exercicio9 {
    public static void execute() {
        Conta conta = new Conta(
                "João",
                123,
                "20",
                0.0,
                "01/01/2025"
        );

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Data de abertura: " + conta.getDataAbertura());

        System.out.println("\nExtrato:");

        System.out.println("Saldo antes do deposito: " + conta.getSaldo());
        conta.deposita(1000.0);
        System.out.println("Saldo após deposito: " + conta.getSaldo());

        System.out.println("Saldo antes do saque: " + conta.getSaldo());
        conta.saca(100.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        System.out.println("Rendimento: " + conta.calculaRendimento());
    }
}

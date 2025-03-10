package com.jrpolesi.exercicio2;

public class Exercicio2 {
    static public void execute() {
        Produto produto = new Produto();

        produto.nome = "Produto teste";
        produto.preco = 15.0;
        produto.quantidadeEmEstoque = 10;

        System.out.printf("Nome: %s\nPreço: %.2f\nEstoque: %d\n", produto.nome, produto.preco, produto.quantidadeEmEstoque);
    }
}
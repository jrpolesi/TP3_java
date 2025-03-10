package com.jrpolesi.exercicio3;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void alterarPreco(final double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(final int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public String exibirInformacoes() {
        return String.format("Nome: %s\nPreço: %.2f\nEstoque: %d", this.nome, this.preco, this.quantidadeEmEstoque);
    }
}

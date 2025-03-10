package com.jrpolesi.exercicio5;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setPreco(final double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(final int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(final double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(final int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public String exibirInformacoes() {
        return String.format("Nome: %s\nPreço: %.2f\nEstoque: %d", this.getNome(), this.getPreco(), this.getQuantidadeEmEstoque());
    }
}

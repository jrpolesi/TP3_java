package com.jrpolesi.exercicio1;

/*
 Classe representa um modelo/estrutura para criar objetos.
 Abaixo temos declarada a classe "Pessoa", que representa uma pessoa genérica,
 contendo informações que qualquer pessoa possui.
*/
class Pessoa {
    /*
     Campos (ou atributos) representam as características de um objeto.
     Neste caso, uma pessoa tem um nome e uma idade.
    */
    public String nome;
    public int idade;

    /*
     Método é uma função dentro de uma classe que define um comportamento para um objeto.
     No caso abaixo, o método envelhece a pessoa, aumentando sua idade.
    */
    public void envelhecer() {
        idade += 1;
        System.out.println(nome + " envelheceu e agora tem " + idade + " anos.");
    }
}
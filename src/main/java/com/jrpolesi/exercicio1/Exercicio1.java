package com.jrpolesi.exercicio1;

public class Exercicio1 {
    static public void execute() {
        // Objeto é uma instância criada a partir de uma classe.
        // Criamos um objeto da classe "Pessoa" e atribuímos seus atributos.
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 25;

        System.out.println("Idade atual: " + pessoa.idade);

        // Chamamos o método "envelhecer" para modificar o estado do objeto.
        pessoa.envelhecer();

        System.out.println("Idade atual: " + pessoa.idade);
    }
}

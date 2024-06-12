package com.example;

// Classe que representa um funcionário registrando seu nome, salário e data de admissão
public class Funcionario {
    private String nome;
    private float salario;
    private String admissao;

    public Funcionario(String nome, float salario, String admissao) {
        this.nome = nome;
        this.salario = salario;
        this.admissao = admissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public void aumentarSalario(float percentual) {
        this.salario += this.salario * (percentual / 100);
    }
}

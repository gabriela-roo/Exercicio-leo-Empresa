package com.example;

import java.util.ArrayList;

// Classe que representa um departamento registrando seu nome e funcionários (máximo 100)
public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>(100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        if (this.funcionarios.size() < 100) {
            this.funcionarios.add(funcionario);
            System.out.println("Funcionário " + funcionario.getNome() + " adicionado ao departamento " + this.nome);
        } else {
            System.out.println("Número máximo de funcionários atingido no departamento " + this.nome);
        }
    }

    public void removeFuncionario(Funcionario funcionario) {
        if (this.funcionarios.remove(funcionario)) {
            System.out.println("Funcionário " + funcionario.getNome() + " removido do departamento " + this.nome);
        } else {
            System.out.println("Funcionário " + funcionario.getNome() + " não encontrado no departamento " + this.nome);
        }
    }

    public void aumentarSalarios(float percentual) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(percentual);
        }
    }
}

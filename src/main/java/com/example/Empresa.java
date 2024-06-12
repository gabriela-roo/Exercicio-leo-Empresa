package com.example;

import java.util.ArrayList;

// Classe que representa uma empresa registrando seu nome, CNPJ e departamentos (máximo 10)
public class Empresa {
    private String nome;
    private String CNPJ;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<>(10);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        if (this.departamentos.size() < 10) {
            this.departamentos.add(departamento);
            System.out.println("Departamento " + departamento.getNome() + " adicionado à empresa " + this.nome);
        } else {
            System.out.println("Número máximo de departamentos atingido na empresa " + this.nome);
        }
    }

    public void removeDepartamento(Departamento departamento) {
        if (this.departamentos.remove(departamento)) {
            System.out.println("Departamento " + departamento.getNome() + " removido da empresa " + this.nome);
        } else {
            System.out.println("Departamento " + departamento.getNome() + " não encontrado na empresa " + this.nome);
        }
    }
}

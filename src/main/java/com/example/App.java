package com.example;

public class App {
    public static void main(String[] args) {
        // Cria uma empresa
        Empresa empresa = new Empresa("TechPets", "987.654.3210-98");

        // Adiciona departamentos à empresa
        Departamento dep1 = new Departamento("Adestramento");
        Departamento dep2 = new Departamento("Cuidado com Animais");
        Departamento dep3 = new Departamento("Banho e Tosa");
        Departamento dep4 = new Departamento("Consultas Veterinárias");

        empresa.addDepartamento(dep1);
        empresa.addDepartamento(dep2);
        empresa.addDepartamento(dep3);
        empresa.addDepartamento(dep4);

        // Adiciona funcionários aos departamentos
        Funcionario funcionario1 = new Funcionario("Gabriela", 2000.00f, "01/05/1990");
        Funcionario funcionario2 = new Funcionario("Joana", 1000.00f, "15/07/1988");
        Funcionario funcionario3 = new Funcionario("Rodolfo", 1200.00f, "21/07/1978");

        dep1.addFuncionario(funcionario1);
        dep1.addFuncionario(funcionario2);
        dep2.addFuncionario(funcionario3);

        // Dá um aumento de 10% a todos os funcionários de um determinado departamento
        dep1.aumentarSalarios(10.0f);

        System.out.println("Salário com reajuste Gabriela: " + funcionario1.getSalario());
        System.out.println("Salário com reajuste Joana: " + funcionario2.getSalario());
        System.out.println("Salário com reajuste Rodolfo: " + funcionario3.getSalario());

        // Transfere um funcionário de um departamento para outro
        dep1.removeFuncionario(funcionario2);
        dep3.addFuncionario(funcionario2);

        System.out.println("Funcionário Joana transferido para o departamento: " + dep3.getNome());
    }
}

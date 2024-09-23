
package com.mycompany.tecelagem_01;

public abstract class Funcionarios {
    
    private String nome, rg;
    private double salarioBase;
    
    
    public Funcionarios(String nome, String rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioLiquido();
    
    public abstract void novoMes( );
    
    public void hollerith(){
        System.out.println("Nome:" + nome + "\n" + 
                           "RG" + rg + "\n" +
                           "Salario Base:" + salarioBase);
    }
    
}


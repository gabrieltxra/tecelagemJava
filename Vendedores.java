package com.mycompany.tecelagem_01;
public class Vendedores extends Funcionarios {
    
    private double vendas;
    private double comissao;
    
    public Vendedores(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        vendas = 0;      
    }
    
    public void registrarVenda(double valor){
        vendas+=valor;
    }
    
    public double comissao(){
        return vendas* 0.03;
    }   
    
    @Override
    public double salarioLiquido() {
       return this.getSalarioBase() + comissao();
    }

    @Override
    public void novoMes() {
        vendas = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith(); 
        System.out.println("Vendas no Mes" + vendas + "\n" + 
                           "Salario Liquido" + salarioLiquido());
    }  
}

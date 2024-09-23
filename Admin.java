package com.mycompany.tecelagem_01;
public class Admin extends Funcionarios {
    
    private int faltas;

    public Admin(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        faltas = 0;
    }
    
    public void RegistrarFalta(){
        faltas++;
    }
    
    public double Desconto(){
      return (this.getSalarioBase()/30 * faltas);
    }

    @Override
    public void novoMes() {
     faltas = 0;
    }
    
    @Override
    public double salarioLiquido(){
        return this.getSalarioBase() - Desconto();
    }
    

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Desconto:" + Desconto() + "\n" + 
                           "Faltas" + faltas + "\n" + 
                           "Salario Liquido" + salarioLiquido());
                                                            
    }
   
}

package com.mycompany.tecelagem_01;
public class Producao extends Funcionarios {
    
    private int horasDiurnas;
    private int horasNoturnas;

    public Producao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        horasDiurnas = 0 ;
        horasNoturnas = 0;
    }
    
     public void registrarHorasDiurnas(int horas){
         horasDiurnas += horas;
     }
     
     public void registrarHorasNoturnas(int horas){
         horasNoturnas += horas;
     }
     
     public double acrescimoDiurno(){
         return this.getSalarioBase() * horasDiurnas;
     }
     
     public double acrescimoNoturno(){
         return this.getSalarioBase() * horasDiurnas * 1.3;
     }
     
    @Override
    public double salarioLiquido(){
        return this.getSalarioBase() + acrescimoDiurno() + acrescimoNoturno();
     }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Horas Diurnas trabalhadas" + horasDiurnas + "\n" +
                           "Horas Noturnas Trabalhadas:" + horasNoturnas + "\n" +
                           "Salario Liquido" + salarioLiquido());
    }   
    
    @Override
    public void novoMes(){
        horasNoturnas = 0;
        horasDiurnas = 0;
    }
}

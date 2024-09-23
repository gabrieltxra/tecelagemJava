
package com.mycompany.tecelagem_01;


public class Tecelagem_01 {

    public static void main(String[] args) {
        
       Admin adm = new Admin("Henrique", "1234", 1412.00);
       adm.RegistrarFalta();
       adm.hollerith();
       
       System.out.println("\n");
       Producao prod = new Producao("Felipe", "12345", 20.12);
       prod.registrarHorasDiurnas(100);
       prod.registrarHorasNoturnas(120);
       prod.hollerith();
       
       System.out.println("\n");
       Vendedores vend = new Vendedores("Biel", "123456", 2100.15);
       vend.registrarVenda(6000);
       vend.hollerith();
       
    }
}

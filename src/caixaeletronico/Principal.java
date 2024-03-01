
package caixaeletronico;

import conta.Conta;


public class Principal {

   
    public static void main(String[] args) {
       Conta c = new Conta();
       c.cadastra();
       c.imprimeConta();
    }
    
}

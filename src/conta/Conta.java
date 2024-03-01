
package conta;


import cliente.Pessoa;
import java.util.Scanner;



public class Conta {
    private double saldo;
    private int numConta;
    private int tipoConta;
    private Pessoa titular = new Pessoa();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    
    
  public Conta(){
      this.setSaldo(0.0);
  }
    
    
    public  void cadastra() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o número da conta");
        this.setNumConta(Integer.parseInt(tec.nextLine()));
        System.out.println("Tipo de conta: (1 - Conta corrente) (2 - Conta Poupança)");
        this.setTipoConta(Integer.parseInt(tec.nextLine()));
        System.out.println("Dados da Pessoa");
        titular.cadastra();
    }
    
    public void imprimeConta(){
        System.out.println("Numero da conta: "+getNumConta());
        if(getNumConta()==1){
            System.out.println("Tipo de conta: Conta corrente");
        }else if(getNumConta()==2){
            System.out.println("Tipo da conta: Conta poupança");
        }
        titular.imprime();
    }
}

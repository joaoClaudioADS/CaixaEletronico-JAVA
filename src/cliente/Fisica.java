
package cliente;

import java.util.Scanner;


public class Fisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void cadastra(){
        Scanner tec = new Scanner(System.in);
        System.out.println("--- Cadastro de Pessoa Física ---");
        super.cadastra();
        System.out.println("Digite o cpf");
        this.setCpf(tec.nextLine());
    }
}

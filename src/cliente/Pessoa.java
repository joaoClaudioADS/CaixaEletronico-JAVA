
package cliente;

import java.util.Scanner;




public class Pessoa {
    protected String telefone;
    protected String nomePessoa;
    protected Endereco e = new Endereco(); 

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Endereco getE() {
        return e;
    }

    public void setE(Endereco e) {
        this.e = e;
    }
    
    public void imprime(){
        System.out.println("Nome do Titular ..: "+this.getNomePessoa());
        System.out.println("Telefone .........: "+this.getTelefone());
        System.out.println("Nome do Títular ..: "+this.getNomePessoa());
        System.out.println("Endereço .........: "+e.getRua());
        System.out.println("Número ...........: "+e.getNumero());
        System.out.println("Cidade ...........: "+e.getCidade());
        System.out.println("Estado ...........: "+e.getUf());
    }
    
    public  void cadastra(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o nome");
        nomePessoa = tec.nextLine();
        System.out.println("Digite o telefone");
        telefone = tec.nextLine();
        e.cadastra();
    }
}

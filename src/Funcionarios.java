
import java.util.Scanner;

public abstract class Funcionarios implements ReembolsoDespesas{
    private String nome;
    private String cpf;
    private String numRegistro;
    private String orgaoLotacao;
    private double salarioBase;


    //Implementando Construtor
    public Funcionarios(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salarioBase = salarioBase;
    }
    //Implementando Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Implementando Metodos

    public void aumentoSalario (){
        Scanner ajuste = new Scanner(System.in);
        System.out.print("Informe o percentual de ajuste que será aplicado ao salário dessa classe de funcionário: ");
        double percentualDeAumento = ajuste.nextDouble();
        double valorDoAjuste = (percentualDeAumento * salarioBase) / 100;
        double salarioAjustado = salarioBase + valorDoAjuste;
        System.out.println("Conforme o percentual informado de " +percentualDeAumento +"%. " +
                "O salário do servidor dessa classe de funcionário será reajustado para: R$ " + salarioAjustado);
    }

    @Override
    public double reembolso(double valor) {

        return valor;
    }
}

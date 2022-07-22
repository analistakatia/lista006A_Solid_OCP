public class Estagiario implements ReembolsoDespesas{

    //Atributo
    private double bolsa;
    private String nome;
    private String cpf;

    public Estagiario(){

    }

    public Estagiario(double bolsa, String nome, String cpf) {
        this.bolsa = bolsa;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public double reembolso(double valor) {
        return valor;
    }



    String informeDados(String nome, String cpf) {
        return nome;
    }

    public double informeValorBolsa(double valorBolsa){

        return valorBolsa;

    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

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
}

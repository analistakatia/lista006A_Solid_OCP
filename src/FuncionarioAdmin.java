
public class FuncionarioAdmin extends Funcionarios{
    private String funcaoAdmin;
    private String senioridade;

    public FuncionarioAdmin(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase, String funcaoAdmin, String senioridade) {
        super(nome, cpf, numRegistro, orgaoLotacao, salarioBase);
        this.funcaoAdmin = funcaoAdmin;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdmin() {
        return funcaoAdmin;
    }

    public void setFuncaoAdmin(String funcaoAdmin) {
        this.funcaoAdmin = funcaoAdmin;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


}

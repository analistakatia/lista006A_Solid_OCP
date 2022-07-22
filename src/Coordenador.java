
import java.util.Scanner;

public class Coordenador extends Funcionarios{
    private int professoresSupervisionados;

    //Criando o construtor
    public Coordenador(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase) {
        super(nome, cpf, numRegistro, orgaoLotacao, salarioBase);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    //Criando Getters e Stters
    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionarProfessor(){
        System.out.println("Quantidade máxima de Professores Supervisionados por cada Coordenador => 10");
        System.out.print("\nQual a quantidade de professores você supervisiona? ");
        Scanner input = new Scanner(System.in);
        professoresSupervisionados = input.nextInt();

        if (professoresSupervisionados < 10){
            System.out.print("\nVocê gostaria de adicionar algum professor a ser supervisionado por você? 1 - S / 2 - N: ");
            int qtdProfAdic = input.nextInt();

            switch (qtdProfAdic){
                case 1:
                System.out.print("Digite quantos professores deseja adicionar respeitando a quantidade máxima permitida (10 por equipe coordenada): ");
                int qtdAdic = input.nextInt();
                int profSupervAtualizados = qtdAdic + professoresSupervisionados;
                    System.out.print("Quantidade atualizada de professores supervisionados por esse coordenador é de: "+profSupervAtualizados+" PROFESSORES");
                break;
                default:
                    System.out.print("Certo. Nenhum professor a adicionar!");
            }
        }else {
            System.out.println("Sua equipe já atingiu o limite de quantidade total de Professores Supervionados (10 por Coordenador) e não poderá ser adicionado mais nenhum à sua equipe! ");
        }
    }

}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Funcionarios {
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professor(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase, String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numRegistro, orgaoLotacao, salarioBase);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public void adicionarTurma() {
        int turma;
        Scanner turma1 = new Scanner(System.in);
        System.out.print("Deseja adicionar alguma nova turma a esse professor? 1 - S / 2 - N: ");
        turma = turma1.nextInt();

        switch (turma) {
            case 1:
                System.out.println("Insira a quantidade de turma a ser adicionada: ");
                turma = turma1.nextInt();
                int turmaAtualizada = qtdTurmas + turma;
                System.out.print("\nQuantidade de turmas atualizada para: " + turmaAtualizada + " turmas");
                break;
            default:
                System.out.println("\nQuantidade de turmas se manteve a mesma sem nenhuma alteração!");
        }
    }

    public void adicionarEstagiario() {

        String nomeEstagiario;
        String[] listaDeEstagiario = new String[0];
        Scanner estagiario = new Scanner(System.in);
        System.out.println("\nVocê tem direito a 2 estagiários.");

        System.out.println("Deseja adicionar algum estagiário? 1 - Sim / 2 - Não: ");
        int qtdEstagiario = estagiario.nextInt();

        switch (qtdEstagiario) {
            case 1:
                System.out.println("Informe dados do estagiário");

                if (listaDeEstagiario.length <= 2){
                    System.out.print("Nome do estagiário: ");
                    nomeEstagiario = estagiario.next();
                    System.out.println("O estagiário " + nomeEstagiario + " foi cadastrado com sucesso!!");

                }
                    System.out.println("Limite atingido. Não é possível adicionar mais estagiários sob sua supervisão!");

                break;
            default:
                System.out.println("Certo. Nenhum estagiário a adicionar!");
        }

    }
}

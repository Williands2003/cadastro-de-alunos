import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula;
    }
}

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.nextLine();

                    Aluno aluno = new Aluno(nome, idade, matricula);
                    alunos.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    } else {
                        System.out.println("\n### Lista de Alunos ###");
                        for (Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

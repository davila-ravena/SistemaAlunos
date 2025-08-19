package main;

import model.Aluno;
import dao.AlunoDAO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoDAO dao = new AlunoDAO();

        int opcao;
        do {
            System.out.println("\n--- Sistema de Gerenciamento de Alunos ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir \n

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();
                    System.out.print("Bolsa (true/false): ");
                    boolean bolsa = sc.nextBoolean();
                    sc.nextLine();
                    dao.adicionarAluno(new Aluno(nome, matricula, curso, bolsa));
                    break;
                case 2:
                    dao.listarAlunos();
                    break;
                case 3:
                    System.out.print("Matrícula do aluno: ");
                    String matBusca = sc.nextLine();
                    Aluno a = dao.buscarAluno(matBusca);
                    if (a != null)
                        System.out.println(a);
                    else
                        System.out.println("Aluno não encontrado.");
                    break;
                case 4:
                    System.out.print("Matrícula do aluno a remover: ");
                    String matRemover = sc.nextLine();
                    dao.removerAluno(matRemover);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

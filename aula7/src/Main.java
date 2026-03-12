import Entidades.Aluno;
import Entidades.GerenciarListaAlunos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarListaAlunos listaAlunos = new GerenciarListaAlunos();


        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("SISTEMAS CRUD DE ALUNOS");
            System.out.println("1 - Cadastrar Aluno: ");
            System.out.println("2 - Listar Aluno: ");
            System.out.println("3 - Alterar Alunos: ");
            System.out.println("4 - Excluir Aluno: ");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao){
                case "1" -> {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double nota1 = sc.nextDouble();

                    System.out.println("Digite a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota1, nota2);
                    listaAlunos.adicionarAluno(aluno);
                }
                case "2" -> {
                    listaAlunos.listarAlunos();
                }
                case "3" -> {
                    listaAlunos.listarAlunos();
                    System.out.print("Digite o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double nota1 = sc.nextDouble();

                    System.out.println("Digite a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    listaAlunos.alterarInformacoesAluno(idAluno, nome, nota1, nota2);
                }
                case "4" -> {
                    listaAlunos.listarAlunos();
                    System.out.print("Digite o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    listaAlunos.removerAluno(idAluno);
                }

                case "5" -> {
                    System.out.println("Saindo do programa!");
                    return;
                }

            }


        }
    }
}

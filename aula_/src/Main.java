import metodos.Roupas;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Roupas> listaDeRoupas = new Roupas("Calça Leggin", 40 ,45.50);

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("======MENU DE OPÇÕES========");
            System.out.println("1 - CADASTRAR:");
            System.out.println("2 - LISTAR PRODUTOS:");
            System.out.println("3 - ATUALIZAR PRODUTOS:");
            System.out.println("4 - REMOVER PRODUTOS:");
            System.out.println("5 - SAIR:");
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            String opcao = sc.nextLine();

            switch(opcao){
                case "1":
                    System.out.println("CADASTRAR PRODUTOS:");
                System.out.println("| ID | NOME | PREÇO | QUANTIDADE | VELOR EM ESTOQUE");
                case "2":
                    System.out.println("LISTAR PRODUTOS:");
                    System.out.println(roupa.toString());
                case "3":
                    System.out.println("ATUALIZAR PRODUTOS:");
                case "4":
                    System.out.println("REMOVER PRODUTOS:");
                case "5":
                    System.out.println("SAIR:");

            }
        }



    }


}


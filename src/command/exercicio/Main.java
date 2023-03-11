package command.exercicio;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1.INCLUIR");
            System.out.println("2.LISTAR");
            System.out.println("3.SELECIONAR");
            System.out.println("4.DELETAR");
            System.out.println("5.ALTERAR");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    Invoker.invoke(opcao);
                    break;
                case 2:
                    Invoker.invoke(opcao);
                    break;
                case 3:
                    Invoker.invoke(opcao);
                    break;
                case 4:
                    Invoker.invoke(opcao);
                    break;
                case 5:
                    Invoker.invoke(5);
                    break;
            }
        }while(opcao!=0);
    }
}

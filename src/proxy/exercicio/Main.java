package proxy.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HDD hdd = new HDD();
        ArmazenamentoDados dados = new HDDProxy(hdd);
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1.Ler Dados");
            System.out.println("2.Gravar Dado");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
            case 1:
                dados.lerDados();
                break;
            case 2:
                dados.gravarDados();
                break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}

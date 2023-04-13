package template_method.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Financiamento financiamento;
        int valor, parcela;
        int opcao;
        do {
            System.out.println("1.CDC");
            System.out.println("2.Consórcio");
            System.out.println("3.Leasing");
            System.out.print("Escolha um tipo de financiamento: ");
            opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    System.out.print("Entre com o valor desejado: ");
                    valor = scanner.nextInt();
                    System.out.print("Entre com o numero de parcelas: ");
                    parcela = scanner.nextInt();
                    financiamento = new CDC();
                    financiamento.templateMethod(valor, parcela);
                break;
                case 2:
                    System.out.print("Entre com o valor desejado: ");
                    valor = scanner.nextInt();
                    System.out.print("Entre com o numero de parcelas: ");
                    parcela = scanner.nextInt();
                    financiamento = new Consorcio();
                    financiamento.templateMethod(valor, parcela);
                break;
                case 3:
                    System.out.print("Entre com o valor desejado: ");
                    valor = scanner.nextInt();
                    System.out.print("Entre com o numero de parcelas: ");
                    parcela = scanner.nextInt();
                    financiamento = new Leasing();
                    financiamento.templateMethod(valor, parcela);
                break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}

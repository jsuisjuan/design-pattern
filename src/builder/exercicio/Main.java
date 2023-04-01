package builder.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        BNFReader reader = new BNFReader();
        String texto, expressao;
        int opcao, escolha;
        do {
            System.out.println("1.Linguagem Matemática");
            System.out.println("2.Linguagem Literal");
            System.out.print("Escolha uma Linguagem: ");
            opcao = scannerInt.nextInt();
            switch (opcao) {
            case 1:
                    do {
                        System.out.println("1.Somar");
                        System.out.println("2.Multiplicar");
                        System.out.print("Escolha uma operação: ");
                        escolha = scannerInt.nextInt();
                        switch (escolha) {
                        case 1: 
                            System.out.print("Entre com a expressão: ");
                            expressao = scannerString.nextLine();
                            reader.setBuilder(new LinguagemIntegerConverter());
                            texto = reader.parserBNF(expressao);
                            System.out.println(texto);
                            break;
                        case 2:
                            System.out.print("Entre com a expressão: ");
                            expressao = scannerString.nextLine();
                            reader.setBuilder(new LinguagemIntegerConverter());
                            texto = reader.parserBNF(expressao);
                            System.out.println(texto);
                            break;
                        }
                    } while (escolha != 0);
                    break;
            case 2:
                do {
                    System.out.println("1.Somar");
                    System.out.println("2.Multiplicar");
                    System.out.print("Escolha uma operação: ");
                    escolha = scannerInt.nextInt();
                    switch (escolha) {
                    case 1: 
                        System.out.print("Entre com a expressão: ");
                        expressao = scannerString.nextLine();
                        reader.setBuilder(new LinguagemStringConverter());
                        texto = reader.parserBNF(expressao);
                        System.out.println(texto);
                        break;
                    case 2:
                        System.out.print("Entre com a expressão: ");
                        expressao = scannerString.nextLine();
                        reader.setBuilder(new LinguagemStringConverter());
                        texto = reader.parserBNF(expressao);
                        System.out.println(texto);
                        break;
                    }
                } while (escolha != 0);
                break;
            }   
        } while (opcao != 0);
        scannerInt.close();
        scannerString.close();
    }
}


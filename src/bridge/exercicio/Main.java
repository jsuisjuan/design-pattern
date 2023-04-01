package bridge.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoDispositivo, opcaoFuncao;
        do {
            System.out.println("\n1.TELEVISÃO");
            System.out.println("2.RÁDIO");
            System.out.println("3.COMPUTADOR");
            System.out.print("Escolha uma opcao: ");
            opcaoDispositivo = scanner.nextInt();
            boolean ligou = false;
            switch(opcaoDispositivo){
                case 1:
                    Televisao tv = new Televisao();
                    tv.setImp(new TelevisaoControleImp());
                    do {
                        System.out.println("\n1.LIGAR");
                        System.out.println("2.DESLIGAR");
                        System.out.print("Escolha uma opcao: ");
                        opcaoFuncao = scanner.nextInt();
                        switch(opcaoFuncao) {
                            case 1: 
                                System.out.print("\n");
                                tv.ligarTelevisao();
                                ligou = true;
                                System.out.println("\tTelevisao ligada com sucesso!");
                                break;
                            case 2:
                                System.out.print("\n");
                                if (!ligou) {
                                    System.out.println("ERRO: televisão está desligada. Favor ligar...");
                                    break;
                                }
                                tv.desligarTelevisao();
                                ligou = false;
                                System.out.println("\tTelevisão desligada com sucesso!");
                                break;
                        } 
                    } while (opcaoFuncao != 0);
                    break;
                case 2:
                    Radio rd = new Radio();
                    rd.setImp(new RadioControleImp());
                    do {
                        System.out.println("\n1.LIGAR");
                        System.out.println("2.DESLIGAR");
                        System.out.print("Escolha uma opcao: ");
                        opcaoFuncao = scanner.nextInt();
                        switch(opcaoFuncao) {
                            case 1: 
                                System.out.print("\n");
                                rd.ligarRadio();
                                ligou = true;
                                System.out.println("\tRádio ligada com sucesso!");
                                break;
                            case 2:
                                System.out.print("\n");
                                if (!ligou) {
                                    System.out.println("ERRO: rádio está desligada. Favor ligar...");
                                    break;
                                }
                                rd.desligarRadio();
                                ligou = false;
                                System.out.println("\tRádio desligada com sucesso!");
                                break;
                        } 
                    } while (opcaoFuncao != 0);
                    break;
                case 3:
                    Computador pc = new Computador();
                    pc.setImp(new ComputadorControleImp());
                    do {
                        System.out.println("\n1.LIGAR");
                        System.out.println("2.DESLIGAR");
                        System.out.print("Escolha uma opcao: ");
                        opcaoFuncao = scanner.nextInt();
                        switch(opcaoFuncao) {
                            case 1: 
                                System.out.print("\n");
                                pc.ligarComputador();
                                ligou = true;
                                System.out.println("\tComputador ligado com sucesso!");
                                break;
                            case 2:
                                System.out.print("\n");
                                if (!ligou) {
                                    System.out.println("ERRO: computador está desligada. Favor ligar...");
                                    break;
                                }
                                pc.desligarComputador();
                                ligou = false;
                                System.out.println("\tComputador desligado com sucesso!");
                                break;
                        } 
                    } while (opcaoFuncao != 0);
                    break;
            }
        } while(opcaoDispositivo != 0);
        scanner.close();
    }
}

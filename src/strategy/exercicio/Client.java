package strategy.exercicio;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();
        int opcao;
        System.out.println("===== XADREZ =====");
        do{
            System.out.println("1.FACIL");
            System.out.println("2.MEDIO");
            System.out.println("3.DIFICIL");
            System.out.println("0.SAIR");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    jogo.setStrategy(new FacilStrategy());
                    jogo.jogar();
                    break;
                case 2:
                    jogo.setStrategy(new MedioStrategy());
                    jogo.jogar();
                    break;
                case 3:
                    jogo.setStrategy(new DificilStrategy());
                    jogo.jogar();
                    break;

            }
        }while(opcao!=0);
    }
}

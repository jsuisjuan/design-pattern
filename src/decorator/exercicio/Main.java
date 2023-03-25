package decorator.exercicio;
import strategy.exercicio.Jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, pizza, condimento;
        System.out.println("===== PIZZARIO =====");
        do{
            System.out.println("1.PIZZA");
            System.out.println("2.CONDIMENTO");
            System.out.println("0.SAIR");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("1.PEPPERONI");
                    System.out.println("2.CALABRESA");
                    System.out.println("3.MUZZARELA");
                    System.out.print("Escolha uma opcao: ");
                    pizza = scanner.nextInt();
                    PedidoPizza pp = new PedidoPizza();
                    switch (pizza) {
                        case 1:
                            Pepperoni pe = new Pepperoni(pp);
                            pe.informarTipo();
                            break;
                        case 2:
                            Calabresa cb = new Calabresa(pp);
                            cb.informarTipo();
                            break;
                        case 3:
                            Muzzarela mz = new Muzzarela(pp);
                            mz.informarTipo();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.PEPPERONI");
                    System.out.println("2.CALABRESA");
                    System.out.println("3.MUZZARELA");
                    System.out.print("Escolha uma opcao: ");
                    condimento = scanner.nextInt();
                    PedidoCondimento pc = new PedidoCondimento();
                    switch (condimento) {
                        case 1:
                            Catchup cc = new Catchup(pc);
                            cc.informarTipo();
                            break;
                        case 2:
                            Mostarda mt = new Mostarda(pc);
                            mt.informarTipo();
                            break;
                        case 3:
                            Maionese mn = new Maionese(pc);
                            mn.informarTipo();
                            break;
                    }
                    break;
            }
        }while(opcao!=0);
    }
}

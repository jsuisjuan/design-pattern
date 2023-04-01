package chain_of_responsability.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String funcao;
        
        System.out.println("\texecutar | coordenar | gerenciar");
        System.out.print("Escolha uma função: ");
        funcao = scanner.nextLine();

        Analista a = new Analista(null, funcao); 
        Coordenador c = new Coordenador(a, funcao);  
        Gerente g = new Gerente(a, funcao);

        a.hierarquiaHandleHelp();
        c.hierarquiaHandleHelp();
        g.hierarquiaHandleHelp();

        scanner.close();
    }
}

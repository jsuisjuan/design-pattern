package interpreter.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] expressao = new int[3];
        
        System.out.println("Escreve 3 valores ou 0 para sair: ");
        for (int i = 0; i < 3; i++) {
            expressao[i] = scanner.nextInt();
        }
        Const c10 = new Const(expressao[0]);
        Const c20 = new Const(expressao[1]);
        Const c30 = new Const(expressao[2]);

        Term t10 = new Term(c10);
        Term t20 = new Term(c20);

        Term t20c30 = new Term(t20, c30);
        Expression e10 = new Expression(t10);

        AbstractExpression e = new Expression(e10, t20c30);
        System.out.println(e.interpret());
       
        scanner.close();
    }
}

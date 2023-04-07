package interpreter.teoria;

public class Main {
    public static void main(String[] args) {
        //Deveria ter uma parser para montar a arvore sintatica
        //10 + 20 * 30
        //  Abs Exp
        //<expr> + <term>
        //<term>   <term> * const
        //const     const    30
        // 10        20
        Const c10 = new Const(10);
        Const c20 = new Const(20);
        Const c30 = new Const(30);

        Term t10 = new Term(c10);
        Term t20 = new Term(c20);

        Term t20c30 = new Term(t20, c30);
        Expression e10 = new Expression(t10);

        AbstractExpression e = new Expression(e10, t20c30);
        System.out.println(e.interpret());
    }
}

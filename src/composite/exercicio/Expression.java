package composite.exercicio;

public class Expression extends BNF{
    private BNF expr;
    private BNF term;
    
    public Expression(BNF term) {
        super();
        this.term = term;
    }

    public Expression(BNF expr, BNF term) {
        super();
        this.expr = expr;
        this.term = term;
    }

    @Override
    public int interpretador() {
        if (expr == null) {
            return term.interpretador();
        }
        return expr.interpretador() + term.interpretador();
    }
}

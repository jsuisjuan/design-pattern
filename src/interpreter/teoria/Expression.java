package interpreter.teoria;

public class Expression extends AbstractExpression {
    private AbstractExpression expr;
    private AbstractExpression term;
    
    public Expression(AbstractExpression term) {
        super();
        this.term = term;
    }

    public Expression(AbstractExpression expr, AbstractExpression term) {
        super();
        this.expr = expr;
        this.term = term;
    }

    @Override
    public int interpret() {
        if (expr == null) {
            return term.interpret();
        }
        return expr.interpret() + term.interpret();
    }
}

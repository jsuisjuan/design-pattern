package interpreter.exercicio;

public class Term extends AbstractExpression {
    private AbstractExpression term;
    private AbstractExpression constante;

    public Term(AbstractExpression constante) {
        super();
        this.constante = constante;
    }

    public Term(AbstractExpression term, AbstractExpression constante) {
        super();
        this.term = term;
        this.constante = constante;
    }

    @Override
    public int interpret() {
        if (term == null) {
            return constante.interpret();
        }
        return term.interpret() * constante.interpret();
    } 
}

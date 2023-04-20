package composite.exercicio;

public class Term extends BNF {
    private BNF term;
    private BNF constante;

    public Term(BNF constante) {
        super();
        this.constante = constante;
    }

    public Term(BNF term, BNF constante) {
        super();
        this.term = term;
        this.constante = constante;
    }

    @Override
    public int interpretador() {
        if (term == null) {
            return constante.interpretador();
        }
        return term.interpretador() * constante.interpretador();
    } 
    
}

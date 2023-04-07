package visitor.teoria;

public class VariableRefNode extends Node {
    private String nomeVar;

    @Override
    public void accept(NodeVisitor v) {
        v.visitVariableRef(this);
    }

    public String getNomeVar() {
        return nomeVar;
    }

    public void setNomeVar(String nomeVar) {
        this.nomeVar = nomeVar;
    }
}

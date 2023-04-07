package visitor.teoria;

public class AssignmentNode extends Node {
    private String typeleftHandVar;
    private String typerightHandExp;

    @Override
    public void accept(NodeVisitor v) {
        v.visitAssignment(this);
    }

    public String getTypeLeftHandVar() {
        return typeleftHandVar;
    }

    public void setTypeLeftHandVar(String typeLeftHandVar) {
        this.typeleftHandVar = typeLeftHandVar;
    }

    public String getTypeRightHandExp() {
        return typerightHandExp;
    }

    public void setTypeRightHandExp(String typerightHandExp) {
        this.typerightHandExp = typerightHandExp;
    }
}

package visitor.teoria;

public class TypeCheckingVisitor extends NodeVisitor {
    @Override
    public void visitAssignment(AssignmentNode n) {
        if (n.getTypeLeftHandVar().equals(n.getTypeRightHandExp())) {
            System.out.println("tipos compativeis");
        } else {
            System.out.println("tipos incompativeis");
        }
    }

    @Override
    public void visitVariableRef(VariableRefNode n) {
        //Nao faz nada
        System.out.println("type checking da variavelref não faz nada");
    }  
}

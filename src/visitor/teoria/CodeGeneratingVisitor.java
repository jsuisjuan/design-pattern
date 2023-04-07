package visitor.teoria;

public class CodeGeneratingVisitor extends NodeVisitor {
    @Override
    public void visitAssignment(AssignmentNode n) {
        System.out.println(n.getTypeLeftHandVar() + " = " + n.getTypeRightHandExp());
    }

    @Override
    public void visitVariableRef(VariableRefNode n) {
        System.out.println(n.getNomeVar());
    }
}

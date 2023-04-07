package visitor.teoria;

public class Main {
    public static void main(String[] args) {
        AssignmentNode n1 = new AssignmentNode();
        n1.setTypeLeftHandVar("string");
        n1.setTypeRightHandExp("string");

        VariableRefNode n2 = new VariableRefNode();
        n2.setNomeVar("minhaVariavel");

        NodeVisitor v1 = new TypeCheckingVisitor();
        NodeVisitor v2 = new CodeGeneratingVisitor();

        n1.accept(v1);
        n2.accept(v1);

        n1.accept(v2);
        n2.accept(v2);
    }
}

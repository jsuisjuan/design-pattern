package interpreter.exercicio;

public class Const extends AbstractExpression {
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}

package composite.exercicio;

public class Const extends BNF{
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int interpretador() {
        return value;
    }
}

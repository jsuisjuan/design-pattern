package command.teoria;

public class BCommand implements Command {
    private static int count = 0;
    private int n;

    public BCommand() {
        count++;
        n = count;
    }

    @Override
    public void execute() {
        System.out.println("Executou comando B na instancia n = " + n);
    }
}

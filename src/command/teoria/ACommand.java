package command.teoria;

public class ACommand implements Command {
    private static int count = 0;
    private int n;

    public ACommand() {
        count++;
        n = count;
    }

    @Override
    public void execute() {
        System.out.println("Executou comando A na instancia n = " + n);
    }
}

package memento.exercicio.command;

public class BCommand implements Command {
    @Override
    public String execute() {
        return "Executou comando B ";
    }
}

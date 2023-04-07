package memento.exercicio.command;

public class ACommand implements Command {
    @Override
    public String execute() {
        return "Executou comando A ";
    }
}

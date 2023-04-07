package memento.exercicio.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {
    private static Map<String, Class> comandos = new HashMap<String, Class>();
    private static List<Command> history = new ArrayList<Command>();
    private static String storage;

    static {
        comandos.put("A", ACommand.class);
        comandos.put("B", BCommand.class);
    }

    public static String invoke(String command) {
        try {
            Command c = (Command)comandos.get(command).newInstance();
            storage = c.execute();
            history.add(c);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return storage;
    }
}

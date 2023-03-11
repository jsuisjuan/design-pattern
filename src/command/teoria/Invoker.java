package command.teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {
    private static Map<String, Class> comandos = new HashMap<String, Class>();
    private static List<Command> history = new ArrayList<Command>();

    static {
        comandos.put("A", ACommand.class);
        comandos.put("B", BCommand.class);
    }

    public static void invoke(String command) {
        try {
            Command c = (Command)comandos.get(command).newInstance();
            c.execute();
            history.add(c);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void reExecuteAll() {
        for (Command command: history) {
            command.execute();
        }
    }
}

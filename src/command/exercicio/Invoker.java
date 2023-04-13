package command.exercicio;

import command.exercicio.comandos.*;

import java.util.*;

public class Invoker {
    private static Map<Integer, Command> comandos = new HashMap<Integer, Command>();
    static List<Cliente> listaCliente = new ArrayList<Cliente>();

    public static void invoke(int opcao) {
        switch (opcao) {
            case 1: new IncluirCliente(listaCliente); break;
            case 2: new ListarCliente(listaCliente); break;
            case 3: new SelecionarCliente(listaCliente); break;
            case 4: new ExcluirCliente(listaCliente); break;
            case 5: new AlterarCliente(listaCliente); break;
        }

    }
}

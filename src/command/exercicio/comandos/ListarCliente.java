package command.exercicio.comandos;

import command.exercicio.Cliente;
import command.exercicio.Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListarCliente implements Command {
    public ListarCliente(List<Cliente> listaCliente){
        System.out.println("------------------------");
        Iterator<Cliente> iterator = listaCliente.iterator();
        while(iterator.hasNext()){
            Cliente cliente = iterator.next();
            System.out.println(cliente);
        }
        System.out.println("------------------------");
    }

    @Override
    public void execute() {
        System.out.println("listagem executada..");
    }
}

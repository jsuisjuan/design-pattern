package command.exercicio.comandos;

import command.exercicio.Cliente;
import command.exercicio.Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SelecionarCliente implements Command {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    public SelecionarCliente(List<Cliente> listaCliente){
        boolean encontrado = false;
        System.out.print("Entre id: ");
        int id = scanner.nextInt();
        System.out.println("------------------------");
        Iterator<Cliente> iterator = listaCliente.iterator();
        while(iterator.hasNext()){
            Cliente cliente = iterator.next();
            if(cliente.getId() == id) {
                System.out.println(cliente);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Id nao encontrado!");
        }
        System.out.println("------------------------");
    }

    @Override
    public void execute() {
        System.out.println("selecao executada..");
    }
}

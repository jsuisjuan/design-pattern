package command.exercicio.comandos;

import command.exercicio.Cliente;
import command.exercicio.Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExcluirCliente implements Command {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    public ExcluirCliente(List<Cliente> listaCliente){
        boolean encontrado = false;
        System.out.print("Entre id: ");
        int id = scanner.nextInt();
        System.out.println("------------------------");
        Iterator<Cliente> iterator = listaCliente.iterator();
        while(iterator.hasNext()){
            Cliente cliente = iterator.next();
            if(cliente.getId() == id) {
                iterator.remove();
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Id nao encontrado!");
        }else{
            System.out.println("Cliente deletado!");
        }
        System.out.println("------------------------");
    }

    @Override
    public void execute() {
        System.out.println("exclusao executada..");
    }
}

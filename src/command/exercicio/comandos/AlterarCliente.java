package command.exercicio.comandos;

import command.exercicio.Cliente;
import command.exercicio.Command;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AlterarCliente implements Command {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    public AlterarCliente(List<Cliente> listaCliente){
        boolean encontrado = false;
        System.out.print("Entre id: ");
        int id = scanner.nextInt();
        System.out.println("------------------------");
        ListIterator<Cliente> li = listaCliente.listIterator();
        while(li.hasNext()){
            Cliente cliente = li.next();
            if(cliente.getId() == id) {
                System.out.print("Entre novo id: ");
                id = scanner.nextInt();
                System.out.print("Entre novo nome: ");
                String nome = scannerString.nextLine();
                li.set(new Cliente(id,nome));
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Id nao encontrado!");
        }else{
            System.out.println("Cliente alterado!");
        }
        System.out.println("------------------------");
    }

    @Override
    public void execute() {
        System.out.println("alteracao executado!");
    }
}

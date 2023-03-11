package command.exercicio.comandos;

import command.exercicio.Cliente;
import command.exercicio.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncluirCliente implements Command {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);
    int id;
    String nome;

    public IncluirCliente(List<Cliente> listaCliente){
        System.out.print("Entre id: ");
        id = scanner.nextInt();
        System.out.print("Entre nome: ");
        nome = scannerString.nextLine();
        listaCliente.add(new Cliente(id,nome));
        System.out.println("cliente criado");
    }

    @Override
    public void execute() {
        System.out.println("inclusao executada..");
    }

}

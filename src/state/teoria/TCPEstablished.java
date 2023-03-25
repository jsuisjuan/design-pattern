package state.teoria;

public class TCPEstablished extends TCPState{
    @Override
    public void open() {
        System.out.println("Não é possível abrir uma conexão que já está estabelecida");
    }

    @Override
    public void close() {
        System.out.println("Conexão fechada com sucesso");
    }

    @Override
    public void acknowledge() {
        System.out.println("ACK");
    }
}

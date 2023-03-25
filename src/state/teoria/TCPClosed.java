package state.teoria;

public class TCPClosed extends TCPState{
    @Override
    public void open() {
        System.out.println("Não é possível abrir uma conexão que já está fechada");
    }

    @Override
    public void close() {
        System.out.println("Não é possível fechar uma conexão que já está fechada");
    }

    @Override
    public void acknowledge() {
        System.out.println("Não é possível ACK em uma conexão que já estpa fechada");
    }
}

package state.teoria;

public class Main {
    public static void main(String[] args){
        TCPConnection tc = new TCPConnection();
        tc.open();
        tc.setState(new TCPEstablished());
        tc.open();
    }
}

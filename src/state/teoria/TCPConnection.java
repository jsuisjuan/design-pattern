package state.teoria;

public class TCPConnection {
    private TCPState state = new TCPListen();

    public void open() {
        state.open();
    }
    public void close() {
        state.close();
    }
    public void acknowledge() {
        state.acknowledge();
    }

    public TCPState getState() {
        return state;
    }
    public void setState(TCPState state) {
        this.state = state;
    }
}

package state.teoria;

public abstract class TCPState {
    public abstract void open();
    public abstract void close();
    public abstract void acknowledge();
}

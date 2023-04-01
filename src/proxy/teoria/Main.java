package proxy.teoria;

public class Main {
    public static void main(String[] args) {
        Image i = new Image();
        Graphic g = new ImageProxy(i);
        g.draw();
        g.getExtent();

        i.draw();
        i.getExtent();
    }
}

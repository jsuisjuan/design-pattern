package proxy.teoria;

public class Image implements Graphic {
    @Override
    public void draw() {
        System.out.println("Executou draw");
    }

    @Override
    public void getExtent() {
       System.out.println("Executou getExtent");
    }
}

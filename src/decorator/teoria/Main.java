package decorator.teoria;

public class Main {
    public static void main(String[] args){
        TextView tv = new TextView();
        ScrollDecorator sd = new ScrollDecorator(tv);
        BorderDecorator bd = new BorderDecorator(sd);
        bd.draw();
    }
}

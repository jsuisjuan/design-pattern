package decorator.teoria;

public class BorderDecorator extends Decorator{
    public BorderDecorator(VisualComponent decorates) {
        super(decorates);
    }
    public void drawBorder(){
        System.out.println("Desenhou a borda");
    }
    @Override
    public void draw(){
        super.draw();
        drawBorder();
    }
}

package decorator.teoria;

public class ScrollDecorator extends Decorator{
    public ScrollDecorator(VisualComponent decorates) {
        super(decorates);
    }
    @Override
    public void draw(){
        super.draw();
        scrollTo();
    }
    public void scrollTo(){
        System.out.println("Executou o Scroll");
    }
}

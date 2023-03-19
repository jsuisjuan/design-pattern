package abstract_factory_method.teoria;

public class PMWidgetFactory extends WidgetFactory{
    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}

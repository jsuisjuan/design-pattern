package mediator.teoria;

public abstract class DialogDirector {
    public void showDialog() {

    }
    public abstract void createWidget();
    public abstract void widgetChanged(Widget w);
}

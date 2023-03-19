package abstract_factory_method.teoria;

public class IDE {
    private Window w;
    private ScrollBar sb;
    public IDE(WidgetFactory wf){
        setLayout(wf);
    }
    public void setLayout(WidgetFactory wf){
        w = wf.createWindow();
        sb = wf.createScrollBar();
        drawApp();
    }
    public void drawApp(){
        w.draw();
        sb.draw();
    }
}

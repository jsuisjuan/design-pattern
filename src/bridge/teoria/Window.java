package bridge.teoria;

public abstract class Window {
    private WindowImp imp;

    public void drawRect() {
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
    }

    public void drawText() {
        imp.devDrawText();
    }

    public WindowImp getImp() {
        return imp;
    }

    public void setImp(WindowImp imp) {
        this.imp = imp;
    }
}

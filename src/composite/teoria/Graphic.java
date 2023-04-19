package composite.teoria;

import java.util.List;

public abstract class Graphic {
    public abstract void add(Graphic g);
    public abstract void remove(Graphic g);
    public abstract List<Graphic> getChilds();
    public abstract void draw();
}
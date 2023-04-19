package composite.teoria;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic {
    private List<Graphic> childs = new ArrayList<Graphic>();
    @Override
    public void add(Graphic g) {
        childs.add(g);
    }

    @Override
    public void remove(Graphic g) {
       childs.remove(g);
    }

    @Override
    public List<Graphic> getChilds() {
       return childs;
    }

    @Override
    public void draw() {
        for (Graphic graphic : childs) {
            graphic.draw();
        }
    }  
}

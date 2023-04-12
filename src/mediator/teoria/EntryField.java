package mediator.teoria;

public class EntryField extends Widget {
    public EntryField(DialogDirector director) {
        super(director);
    }
    public void setText() {
        changed();
    }
}

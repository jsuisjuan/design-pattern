package mediator.teoria;

public class ListBox extends Widget {
    public ListBox(DialogDirector director) {
        super(director);
    }
    public void getSelection() {
        System.out.println("recuperou a seleção");
    }
}

package mediator.teoria;

public class FontDialogDirector extends DialogDirector {
    private ListBox lb;
    private EntryField ef;

    @Override
    public void createWidget() {
        lb = new ListBox(this);
        ef = new EntryField(this);
    }

    @Override
    public void widgetChanged(Widget w) {
       lb.getSelection();
    }

    public EntryField getEf() {
        return ef;
    }

    public static void main(String[] args) {
        FontDialogDirector d = new FontDialogDirector();
        d.createWidget();
        d.getEf().setText(); //isto aqui quem faz é o usuario na interação com a tela!!
    }
}

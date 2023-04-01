package chain_of_responsability.teoria;

public class Button extends HelpHandler {
    private boolean ativo;

    public Button(HelpHandler handler, boolean ativo) {
        super(handler);
        this.ativo = ativo;
    }
    
    @Override
    public void handleHelp() {
        if (ativo) {
            System.out.println("Tratou o help no botão");
        } else {
            super.handleHelp();
        }
    }
}

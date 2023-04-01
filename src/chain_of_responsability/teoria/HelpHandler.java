package chain_of_responsability.teoria;

public abstract class HelpHandler {
    private HelpHandler handler;

    public HelpHandler(HelpHandler handler) {
        this.handler = handler;
    }

    public void handleHelp() {
        if (this.handler != null) {
            System.out.println("repassou chamada do help");
            this.handler.handleHelp();
        } else {
            System.out.println("Não foi possível tratar o evento de help");
        }
    }
}

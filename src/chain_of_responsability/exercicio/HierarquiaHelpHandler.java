package chain_of_responsability.exercicio;

public class HierarquiaHelpHandler {
    private HierarquiaHelpHandler handler;

    public HierarquiaHelpHandler(HierarquiaHelpHandler handler) {
        this.handler = handler;
    }

    public void hierarquiaHandleHelp() {
        if (this.handler != null) {
            System.out.println("subiu hierarquia organizacional");
            this.handler.hierarquiaHandleHelp();
        } else {
            System.out.println("Não foi possível tratar a responsabilidade específica");
        }
    }
}

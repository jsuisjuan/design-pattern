package chain_of_responsability.exercicio;

public class Gerente extends HierarquiaHelpHandler {
    private String responsabilidade = "gerenciar";
    public Gerente(HierarquiaHelpHandler handler, String responsabilidade) {
        super(handler);
        this.responsabilidade = responsabilidade;
    }
    @Override
    public void hierarquiaHandleHelp() {
        if (responsabilidade == "gerenciar") {
            System.out.println("Gerente gerenciou a responsabilidade");
        } else {
            super.hierarquiaHandleHelp();
        }
    }
}

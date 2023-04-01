package chain_of_responsability.exercicio;

public class Analista extends HierarquiaHelpHandler {
    private String responsabilidade = "executar";
    public Analista(HierarquiaHelpHandler handler, String responsabilidade) {
        super(handler);
        this.responsabilidade = responsabilidade;
    }
    @Override
    public void hierarquiaHandleHelp() {
        if (responsabilidade == "executar") {
            System.out.println("Analista executou a responsabilidade");
        } else {
            super.hierarquiaHandleHelp();
        }
    }
}

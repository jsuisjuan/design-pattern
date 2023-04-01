package chain_of_responsability.exercicio;

public class Coordenador extends HierarquiaHelpHandler {
    private String responsabilidade = "coordenar";
    public Coordenador(HierarquiaHelpHandler handler, String responsabilidade) {
        super(handler);
        this.responsabilidade = responsabilidade;
    }
    @Override
    public void hierarquiaHandleHelp() {
        if (responsabilidade == "coordernar") {
            System.out.println("Coordenador coordenou a responsabilidade");
        } else {
            super.hierarquiaHandleHelp();
        }
    }
}

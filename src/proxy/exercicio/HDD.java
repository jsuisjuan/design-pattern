package proxy.exercicio;

public class HDD implements ArmazenamentoDados {
    @Override
    public void lerDados() {
        System.out.println("leitura executada com sucesso");
    }

    @Override
    public void gravarDados() {
        System.out.println("gravação executada com sucesso");
    } 
}

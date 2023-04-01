package proxy.exercicio;

public class HDDProxy implements ArmazenamentoDados {
    private HDD hdd;

    public HDDProxy(HDD hdd) {
        this.hdd = hdd;
    }

    @Override
    public void lerDados() {
        System.out.println("proxy executou para leitura de dados");
        hdd.lerDados();
    }

    @Override
    public void gravarDados() {
        System.out.println("proxy executou para gravação de dados");
        hdd.gravarDados();
    }
}

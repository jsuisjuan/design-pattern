package strategy.teoria;

public class Client {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.jogar();

        jogo.setStrategy(new DificilStrategy());
        jogo.jogar();
    }
}

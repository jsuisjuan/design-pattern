package strategy.teoria;

public class Jogo {
    private Strategy strategy;
    public void setStrategy(Strategy st) {
        this.strategy = st;
    }
    public Jogo() {
        strategy = new FacilStrategy();
    }
    public void jogar() {
        strategy.jogar();
    }
}

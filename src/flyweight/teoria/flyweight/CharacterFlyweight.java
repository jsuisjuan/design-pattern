package flyweight.teoria.flyweight;

public class CharacterFlyweight extends Flyweight {
    private static int contadorInstancias = 0;
    private char c;

    CharacterFlyweight(char c) {
        this.c = c;
        contadorInstancias++;
    }

    @Override
    public void print(String formato) {
        System.out.print(c + formato);
    }

    public static int getQuantidadeInstancias() {
        return contadorInstancias;
    }
}

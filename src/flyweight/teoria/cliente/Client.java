package flyweight.teoria.cliente;

import java.util.ArrayList;
import java.util.List;

import flyweight.teoria.flyweight.CharFactory;
import flyweight.teoria.flyweight.CharacterFlyweight;

public class Client {
    public static void main(String[] args) {
        List<CharacterFlyweight> textoEmMemoria = new ArrayList<>();
        String texto = "este e um texto onde as letras repetem";
        System.out.println("Tamanho do texto = " + texto.length());
        for (char c : texto.toCharArray()) {
            textoEmMemoria.add(CharFactory.getFlyweight(c));
        }

        for (CharacterFlyweight characterFlyweight : textoEmMemoria) {
            characterFlyweight.print("|");
        }

        System.out.println("\nQuantidade de instâncias = " + CharacterFlyweight.getQuantidadeInstancias());
    }
}

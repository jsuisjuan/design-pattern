package singleton.teoria;

public class MeuSingleton {
    private static MeuSingleton instance;
    private static MeuSingleton getInstance() {
        if (instance == null) {
            instance = new MeuSingleton();
        }
        return instance;
    }
    private MeuSingleton() {
    }
}

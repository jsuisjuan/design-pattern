package singleton.exercicio;

import facade.teoria.model.Cliente;
import singleton.teoria.MeuSingleton;

public class ClienteSingleton {
    private static ClienteSingleton instance;
    private static ClienteSingleton getInstance() {
        if (instance == null) {
            instance = new ClienteSingleton();
        }
        return instance;
    }
    private ClienteSingleton() {
    }
}

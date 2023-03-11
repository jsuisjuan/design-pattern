package facade.exercicio.model;

import facade.teoria.model.Cliente;
import facade.teoria.model.DataBase;

import java.util.List;

public class ModelFacade {
    public static List<Produto> listarTodosProdutos() {
        return DataBase.produtos;
    }
}

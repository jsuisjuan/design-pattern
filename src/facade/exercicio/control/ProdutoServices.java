package facade.exercicio.control;

import facade.exercicio.model.Produto;
import facade.exercicio.model.ModelFacade;

import java.util.List;

public class ProdutoServices {
    public List<Produto> listarTodosProdutos() {
        return ModelFacade.listarTodosProdutos();
    }
}

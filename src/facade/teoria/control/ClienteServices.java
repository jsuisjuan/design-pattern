package facade.teoria.control;

import facade.teoria.model.Cliente;
import facade.teoria.model.ModelFacade;

import java.util.List;

public class ClienteServices {
    public List<Cliente> listarTodosClientes() {
        return ModelFacade.listarTodosClientes();
    }
}

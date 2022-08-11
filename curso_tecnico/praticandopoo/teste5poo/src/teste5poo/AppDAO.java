package teste5poo;

import java.util.List;

/**
 * @author Claudemir Souza
 */
public interface AppDAO {

    public void salvar(Object registro);

    public void atualizar(Object registro);

    public void deletar(int id);

    public Object buscar(int id);

    public List<Object> listar();
}

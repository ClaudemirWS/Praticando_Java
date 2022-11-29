package teste5poo;

import java.util.List;

/**
 * @author Claudemir Souza
 */
public class FuncionarioDAO implements AppDAO {

    @Override
    public void salvar(Object registro) {
        System.out.println("Funcionário salvo!");
    }

    @Override
    public void atualizar(Object registro) {
        System.out.println("Funcionário atualizado!");
    }

    @Override
    public void deletar(int id) {
        System.out.println("Funcionário deletado!");
    }

    @Override
    public Object buscar(int id) {
        System.out.println("Funcionário não encontrado!");
        return null;
    }

    @Override
    public List<Object> listar() {
        System.out.println("Nenhum funcionário cadastrado!");
        return null;
    }

    public void verificarFerias(int id) {
        System.out.println("Funcionário possui 10 dias de férias remuneradas!");
    }
}

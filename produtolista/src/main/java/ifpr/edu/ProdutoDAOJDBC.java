package ifpr.edu;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOJDBC implements ProdutoDAO {

    @Override
    public void inserir(Produto produto) {
        System.out.println("Simulando: Produto salvo no BANCO DE DADOS MySQL!");
    }

    @Override
    public List<Produto> listar() {
        System.out.println("Simulando: Buscando todos do BANCO DE DADOS...");
        return new ArrayList<>();
    }

    @Override
    public Produto buscarPorId(int id) {
        System.out.println("Simulando: Buscando ID " + id + " no BANCO DE DADOS...");
        return null; 
    }

    @Override
    public void remover(int id) {
        System.out.println("Simulando: Produto removido do BANCO DE DADOS!");
    }
}

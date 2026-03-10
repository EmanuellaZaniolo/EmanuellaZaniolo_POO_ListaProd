package ifpr.edu;

public class Main {
    public static void main(String[] args) {
        
        ProdutoDAO dao = new ProdutoDAOLista(); 
    
        Produto p1 = new Produto(1, "Notebook", 3500.00);
        Produto p2 = new Produto(2, "Mouse", 120.00);

        dao.inserir(p1);
        dao.inserir(p2);

        System.out.println("\nlistando");
        for (Produto p : dao.listar()) {
            System.out.println(p.toString());
        }

        System.out.println("\nremovendo prond 1");
        Produto encontrado = dao.buscarPorId(1);
        System.out.println(encontrado);

    
        System.out.println("\nremovendo prod 2");
        dao.remover(2);
        
        System.out.println("Todos " + dao.listar().size());
    }
}

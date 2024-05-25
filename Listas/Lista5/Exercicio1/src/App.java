import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja1 = new Loja("Lojinha", "rua Rabisco 324");

        loja1.setEstaAberto(true);

        Produto produto1 = new Produto("Bolacha", 2.50, "Trakinas");

        produto1.setId(1);
        produto1.setPreco(2.80);

        Produto produto2 = new Produto("Bala", 5.50, "Fini");

        produto2.setId(2);

        Produto produto3 = new Produto("Salgadinho", 4.0, "Fofura");

        produto3.setId(3);
        produto3.setPreco(3.50);

        loja1.adicionarProduto(produto1);
        loja1.adicionarProduto(produto2);
        loja1.adicionarProduto(produto3);
        loja1.imprimirProdutos();
    }
}
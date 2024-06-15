import exceptions.PrecoInvalidoException;
import exceptions.NomeInvalidoException;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Chocolate", 3.50);
        
        try {
            Produto produto2 = new Produto("MeM", 3.50);
        } catch(NomeInvalidoException exception ) {
            System.out.println(exception.getMessage());
        }

        try {
            Produto produto2 = new Produto("Pilha", 0);
        } catch(PrecoInvalidoException exception ) {
            System.out.println(exception.getMessage());
        }
    }
}
package exceptions;

public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException() {
        super("Preco precisa ser maior!");
    }
}

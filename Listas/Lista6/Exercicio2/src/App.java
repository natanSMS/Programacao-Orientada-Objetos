import animais.Abelha;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Abelha abelha1 = new Abelha("Abelha Africana", 1.2);
        Gato gato1 = new Gato("Laranja", "Siames");

        abelha1.comer();
        abelha1.emitirSom();

        gato1.comer();
        gato1.emitirSom();
    }
}

import java.util.*;

public class App {
    public static final Scanner SCAN = new Scanner(System.in);
    public static final int QUANTIDADE_CRITICOS = 3;
    public static int[] notas = new int[QUANTIDADE_CRITICOS];

    public static void main(String[] args) throws Exception {
        preencherNotas();
        imprimirMedia();
    }

    public static void preencherNotas() {
        for(int i = 0; i < QUANTIDADE_CRITICOS; i++) {
            notas[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static void imprimirMedia() {
        int somatorio = 0;

        for(int i = 0; i < QUANTIDADE_CRITICOS; i++) {
            somatorio += notas[i];
        }

        System.out.println(somatorio / QUANTIDADE_CRITICOS);
    }
}

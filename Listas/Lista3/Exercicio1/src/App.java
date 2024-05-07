import java.util.*;

public class App {
    public static final int ANO_ATUAL = 2024;
    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int anoNascimento = Integer.parseInt(SCAN.nextLine());
        System.out.println(String.format("Ate o final de %s voce tera %s anos", ANO_ATUAL, retornarIdadeAtual(anoNascimento)));
    }

    public static int retornarIdadeAtual(int nascimento) {
        return ANO_ATUAL - nascimento;
    }
}

import java.util.*;

public class App {
    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nome1 = SCAN.nextLine();
        String nome2 = SCAN.nextLine();

        imprimirIgualdade(nome1, nome2);
    }

    public static void imprimirIgualdade(String nome1, String nome2) {
        if(nome1.equals(nome2)) {
            System.out.println("As palavras sao identicas");
        } else if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("As palavras sao iguais ignorando maisculo e minusculo");
        } else {
            System.out.println("As palavras sao diferentes");
        }
    }
}

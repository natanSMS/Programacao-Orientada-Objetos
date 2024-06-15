import java.util.*;

public class Main {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
      String frase = SCAN.nextLine();
      String[] fraseSeparada = frase.split(" ");

    for(int i = 0; i < fraseSeparada.length; i++){
        if(i != fraseSeparada.length - 1){
            System.out.println(fraseSeparada[i]);
        } else {
            imprimirUltimaPalavra(fraseSeparada[i]);
        }
    }
  }
    public static void imprimirUltimaPalavra(String palavra){
        char[] palavraSeparada = new char[palavra.length()];
        palavraSeparada = palavra.toCharArray();

        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavraSeparada[i]);
        }
    }
}
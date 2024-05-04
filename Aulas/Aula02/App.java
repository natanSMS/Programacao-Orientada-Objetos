import java.util.*;

public class Main {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        String palavra = SCAN.nextLine();

        if(!verificarPalavra(palavra)){
            System.out.println("A palavra deve ter mais de 3 letras e não pode ter espaços entre letras");
        } else {
            if(!procurarNoDiscurso(palavra)){
                System.out.println("A palavra " + palavra + " não esta presente no discurso");
            } else {
                System.out.println("A palavra " + palavra + " esta presente no discurso");
            }
        }
    }

    public static boolean verificarPalavra(String palavra){
        palavra = palavra.strim();

        return !(palavra.isBlank()) && !(palavra.lenght() > 3);
    }

    public static boolean procurarNoDiscurso(String palavra){
        return palavra.contains(
        """
            Voce nao vai acreditar. Mas voce cabia aqui. 
            Eu segurava voce e dizia "Esse menino vai ser o melhor menino do mundo. 
            Esse menino vai ser melhor do que qualquer um que conhecemos.". 
            E voce cresceu bom, maravilhoso.
            
            Ai chegou a hora de voce ser adulto e conquistar o mundo. E conquistou.
             Mas em algum ponto desse percurso, voce mudou. Voce deixou de ser voce.
            
            Agora deixa as pessoas botarem o dedo na sua cara e dizer que voce nao e bom.
            Eu vou te dizer uma coisa que voce ja sabe: O mundo nao e um grande arco-iris.
            E um lugar sujo, e um lugar cruel. Que nao quer saber o quanto voce e duro.
            Vai botar voce de joelhos e voce vai ficar de joelhos para sempre se voce deixar.
            
            Voce, eu, ninguem vai bater tao duro como a vida. Mas nao se trata de bater duro.
            Se trata de quanto voce aguenta apanhar e seguir em frente.
            O quanto voce e capaz de aguentar e continuar tentando.
            E assim que se consegue vencer.
            
            Agora se voce sabe o seu valor, entao va atras do que voce merece.
            Mas tem que ter disposicao para apanhar.
            E nada de apontar dedos, dizer que voce nao consegue por causa dele,
            dela ou de quem seja. So covardes fazem isso e voce nao e covarde.
            Voce e melhor do que isso!            
        """;)
    }
}
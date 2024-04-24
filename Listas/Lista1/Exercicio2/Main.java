import java.util.*;

public class Main{
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_MAPA = 4;
    private static boolean[][] mapa = new boolean[TAMANHO_MAPA][TAMANHO_MAPA];
    public static void main(String[] args){
        preencherVetor();

        int linhaAtual = Integer.parseInt(SCAN.nextLine());
        int colunaAtual = Integer.parseInt(SCAN.nextLine());

        marcarTrue(linhaAtual, colunaAtual);
        imprimirMapa();
    }

    public static void preencherVetor(){
        for(int i = 0; i < TAMANHO_MAPA; i++){
            for(int j = 0; j < TAMANHO_MAPA; j++){
                mapa[i][j] = false;
            }
        }
    }

    public static void marcarTrue(int linha, int coluna){
        mapa[linha][coluna] = true;
    }

    public static void imprimirMapa(){
        for(int i = 0; i < TAMANHO_MAPA; i++){
            System.out.print("|");
            for(int j = 0; j < TAMANHO_MAPA; j++){
                if(mapa[i][j]){
                    System.out.print("X|");
                } else{
                    System.out.print("O|");
                }
            }
            System.out.println();
        }
    }
}
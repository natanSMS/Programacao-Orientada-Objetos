import java.util.*;

public class Main {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_LISTA = 10;
  
    private static int[] listaNumeros = new int[TAMANHO_LISTA];
  
    public static void main(String[] args) {
        preencherLista();
      
        int numero = Integer.parseInt(SCAN.nextLine());
      
        boolean estaNaLista = buscarNaLista(numero);
      
        if(estaNaLista){
            System.out.println("ACHEI");
        } else{
            System.out.printf("NAO ACHEI");
        }
    }
  
    public static void preencherLista(){
        for(int i = 0; i < TAMANHO_LISTA; i++){
            listaNumeros[i] = Integer.parseInt(SCAN.nextLine());
        }
    }
    
    public static boolean buscarNaLista(int numero){
        for(int i = 0; i < TAMANHO_LISTA; i++){
            if(listaNumeros[i] == numero){
            return true;
            }
        }
      return false;
    }
}
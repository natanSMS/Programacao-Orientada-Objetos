public class Musico {
    String nome;
    int idade;
    String instrumento;
    boolean ehCantor;

    public void tocarMusica(){
        System.out.println("Tirando um som!");
    }

    public void cantar(){
        if(ehCantor){
            System.out.println("LALAIA LALAIA LAIA");
        } else {
            System.out.println("HSUASHUASHAUSH");
        }
    }
}

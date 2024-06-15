public class Time {
    String nome;
    String bandeira;
    String modalidades;
    boolean estaCompleto;
    int competicoesGanhas;
    int competicoesPerdidas;
    boolean ganhouPartida;
    ArrayList<Atleta> atletas = new ArrayList<>();

    public void competir(){
        System.out.println("O time " + nome + " entrou na competicao");
    }

    public void comemorar(){
        if(ganhouPartida){
            System.out.println("eba");
        } else {
            System.out.println("poxa");
        }
    }
}

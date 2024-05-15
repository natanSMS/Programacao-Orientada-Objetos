public class Brincadeira {
    String nome;
    int tempoEmSegundos;
    String objetivo;
    boolean temPremio;
    String premio;

    public void anunciarComecoDoJogo() {
        if(temPremio) {
            System.out.println("Jogo de " + nome + ", valendo " + premio + ", iniciado!");
        } else {
            System.out.println("Jogo de " + nome + ", valendo um parabéns, iniciado!");
        }
    }

    public void verificarTempo() {
        if(tempoEmSegundos == 0) {
            System.out.println("Tempo encerrado!");
        } else {
            System.out.println("Falta(m) " + tempoEmSegundos / 60 + " minuto(s) e " + tempoEmSegundos % 60 + " segundo(s)!");
        }
    }

    public void imprimirAtributos() {
        System.out.println("nome: " + nome);
        System.out.println("tempo: " + tempoEmSegundos);
        System.out.println("objetivo: " + objetivo);
        System.out.println("temPremio: " + temPremio);
        System.out.println("premio: " + premio);
    }
}

public class Microondas {
    String cor;
    String tamanho;
    int peso;
    boolean estaLigado;
    boolean estaAberto;
    int tempoAtualEmSegundos;

    public void abrirOuFechar() {
        if(estaAberto) {
            System.out.println("*pow* (fechando microondas)");
            estaAberto = false;
        } else {
            System.out.println("*tuc* (abrindo microondas)");
            estaAberto = true;
        }
    }

    public void iniciar() {
        if(!estaLigado) {
            System.out.println("(conecte o microondas na tomada)");
        } else if (estaAberto) {
            System.out.println("(feche o microondas)");
        } else if (tempoAtualEmSegundos > 0) {
            System.out.println("(esquentando)");
        } else {
            System.out.println("(insira o tempo)");
        }
    }

    public void imprimirAtributos() {
        System.out.println("cor: " + cor);
        System.out.println("tamanho: " + tamanho);
        System.out.println("peso: " + peso);
        System.out.println("esta ligado?: " + estaLigado);
        System.out.println("esta aberto?: " + estaAberto);
        System.out.println("tempo atual: " + tempoAtualEmSegundos);
    }
}

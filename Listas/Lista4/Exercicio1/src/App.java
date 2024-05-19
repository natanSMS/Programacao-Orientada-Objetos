public class App {
    public static void main(String[] args) throws Exception {
        Brincadeira brincadeira1 = new Brincadeira();

        System.out.println("Brincadeira:");
        brincadeira1.nome = "Pega-pega";
        brincadeira1.tempoEmSegundos = 300;
        brincadeira1.objetivo = "Não ser pego";
        brincadeira1.temPremio = true;
        brincadeira1.premio = "bala";

        brincadeira1.imprimirAtributos();
        System.out.println();

        Mochila mochila1 = new Mochila();

        System.out.println("Mochila:");
        mochila1.cor = "preta";
        mochila1.pesoSuportavel = 40;
        mochila1.pesoAtual = 30;
        mochila1.tamanho = "média";
        mochila1.temRodinhas = false;
        mochila1.estaAberta = false;
        mochila1.boasCondicoes = true;

        mochila1.imprimirAtributos();
        System.out.println();

        Microondas microondas1 = new Microondas();

        System.out.println("Microondas:");
        microondas1.cor = "branco";
        microondas1.tamanho = "grande";
        microondas1.peso = 20;
        microondas1.estaLigado = false;
        microondas1.estaAberto = true;
        microondas1.tempoAtualEmSegundos = 30;

        microondas1.imprimirAtributos();
    }
}

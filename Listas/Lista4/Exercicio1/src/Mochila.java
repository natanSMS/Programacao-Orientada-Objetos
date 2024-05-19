public class Mochila {
    String cor;
    int pesoSuportavel;
    int pesoAtual;
    String tamanho;
    boolean temRodinhas;
    boolean estaAberta;
    boolean boasCondicoes;

    public void abrirOuFechar() {
        if (estaAberta) {
            System.out.println("*ZUPP* (fechando mochila)");
            estaAberta = false;
        } else {
            System.out.println("*ZIPP* (abrindo mochila)");
            estaAberta = true;
        }
    }

    public void suportarPeso() {
        if (!boasCondicoes) {
            System.out.println("(nao e possivel transportar nada)");
        } else if (pesoAtual <= pesoSuportavel) {
            System.out.println("(mochila suportando o peso)");
        } else {
            System.out.println("*plof* (mochila nao suportou peso e rasgou)");
            boasCondicoes = false;
        }
    }

    public void imprimirAtributos() {
        System.out.println("cor: " + cor);
        System.out.println("peso suportavel: " + pesoSuportavel);
        System.out.println("peso atual: " + pesoAtual);
        System.out.println("tamanho: " + tamanho);
        System.out.println("tem rodinhas: " + temRodinhas);
        System.out.println("esta aberta?: " + estaAberta);
        System.out.println("esta em boas condicoes?: " + boasCondicoes);
    }
}

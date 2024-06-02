package animais;

public class Abelha implements Animal{
    private String especie;
    private boolean voando;
    private double tamanho;

    public Abelha(String especie, double tamanho) {
        this.especie = especie;
        this.tamanho = tamanho;
    }

    @Override
    public void comer() {
        System.out.println("*nhic* (comendo)");
    }

    @Override
    public void emitirSom() {
        System.out.println("*zuumm*");
    }

    public String getEspecie() {
        return this.especie;
    }

    public boolean getVoando() {
        return this.voando;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}

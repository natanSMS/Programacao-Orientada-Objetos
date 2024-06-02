package animais;

public class Gato implements Animal {
    private String raca;
    private String cor;
    private int vidas = 7;

    public Gato(String cor, String raca) {
        this.raca = raca;
        this.cor = cor;
    }

    @Override
    public void comer() {
        System.out.println("*gulp* (comendo)");
    }

    @Override
    public void emitirSom() {
        System.out.println("*miau*");
    }

    public String getRaca() {
        return this.raca;
    }

    public String getCor() {
        return this.cor;
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}

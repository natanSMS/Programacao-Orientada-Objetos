package veiculos;

public class Carro implements Veiculo {
    private String cor;
    private String marca;
    private int rodas = 4;

    public Carro(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }

    @Override
    public void acelerar() {
        System.out.println("*Vrumm* (acelerando)");
    }

    @Override
    public void freiar() {
        System.out.println("*fuuuu* (freiando)");
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getRodas() {
        return rodas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

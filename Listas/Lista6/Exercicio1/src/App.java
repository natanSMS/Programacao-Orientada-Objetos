import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Laranja", "Carrinhos");

        Moto moto1 = new Moto("Azul", "Motinhas");

        carro1.acelerar();
        carro1.freiar();

        moto1.acelerar();
        moto1.freiar();
    }
}
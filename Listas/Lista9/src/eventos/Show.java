package eventos;

import java.util.List;

public class Show extends Evento{
    private List<String> artistas;

    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(super.getNome());
        System.out.println(super.getLocal());
        System.out.println(super.getData());
        System.out.println(this.artistas);
    }

    @Override
    public void comecarEvento() {
        System.out.println("Começou o show!!!");
    }

    public void comecarEvento(boolean comAplausos) {
        if(comAplausos) {
            System.out.println("Começou o show!!! *clap* *clap* *clap* (aplausos)");
        } else {
            comecarEvento();
        }
    }
}

package eventos;

public class StandUp extends Evento{
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(super.getNome());
        System.out.println(super.getLocal());
        System.out.println(super.getData());
        System.out.println(this.comediante);
    }

    @Override
    public void comecarEvento() {
        System.out.println("Com vocês... " + comediante + "!!!");
    }

    public void começarEvento(String piada) {
        System.out.println("Com vocês... " + comediante + "!!!");
        System.out.println(comediante + ": " + piada);
    }
}

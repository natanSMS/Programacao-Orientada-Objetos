package eventos;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        setNome(nome);
        setLocal(local);
        setData(data);
    }

    public void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(local);
        System.out.println(data);
    }

    public abstract void comecarEvento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

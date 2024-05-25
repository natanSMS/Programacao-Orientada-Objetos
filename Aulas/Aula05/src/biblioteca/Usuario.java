package biblioteca;
public class Usuario {
    private String nome;
    private int id;
    private String endereco;
    private int idade;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getEndereco () {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<> getLivros() {
        return
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

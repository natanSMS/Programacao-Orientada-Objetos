public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (usuario.getIdade() < Livro.getClassificacaoIndicativa()) {
            System.out.println("Vê se cresce!")
        } else if (Livro.getEstaEmprestado) {
            System.out.println("Livro está emprestado!")
        } else {
            Livro.setEstaEmprestado = true;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

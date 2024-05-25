package loja;

public class Produto {
    private String nome;
    private double preco;
    private String marca;
    private int id;

    public Produto(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public void imprimirAtributos() {
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("marca: " + marca);
        System.out.println("id: " + id);
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setId(int id) {
        this.id = id;
    }
}

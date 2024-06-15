package loja;

public class Loja {
    private String nome;
    private double preco;

    public Loja (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Execption {
        if(nome.size() > 3) {
            this.nome = nome;
        } else {
            ...;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0) {
            ...;
        } else {
            this.preco = preco;
        }
    }
}
package loja;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private String endereco;
    private boolean estaAberto;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void imprimirProdutos() {
        for(Produto produto: produtos) {
            produto.imprimirAtributos();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean getEstaAberto() {
        return estaAberto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstaAberto(boolean estaAberto) {
        this.estaAberto = estaAberto;
    }
}

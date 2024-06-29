package locadora;

import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo;

    public void adicionarItem(T item) {
        acervo.add(item);
    }

    public void listarItens() {
        for(T item : acervo) {
            System.out.println(item);
        }
    }

    public T buscarItem(String titulo) {
        for(T item : acervo) {
            if(item instanceof Filme) {
                Filme filme = (Filme) item;
                if(filme.getTitulo().equals(titulo)){
                    return item;
                }
            } else if(item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                if(jogo.getTitulo().equals(titulo)){
                    return item;
                }
            }
        }
        return null;
    }
}

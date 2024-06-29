import java.util.ArrayList;
import java.util.List;

import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> atores = new ArrayList<String>();
        Filme filme = new Filme("minha mãe é uma peça", "André Pellenz", atores);
        atores.add("Paulo Gustavo");
        atores.add("Rodrigo Pandolfo");
        atores.add("Mariana Xavier");

        Jogo jogo = new Jogo("Minecraft", "Xbox360");

        Locadora<AudioVisual> locadora = new Locadora<AudioVisual>();
        Locadora.adicionarItem(filme);
        Locadora.adicionarItem(Jogo);
        Locadora.listarItens""();
        Locadora.buscarItem("Minecraft");
    }
}

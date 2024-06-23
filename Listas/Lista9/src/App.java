import java.util.Arrays;

import eventos.Show;
import eventos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        Show show1 = new Show("Pagodao do Klebao", "Rua XPTO", "30/02", Arrays.asList("Kleber", "Cleiton", "Paulo"));
        StandUp standUp1 = new StandUp("Ria beça", "Rua XTOP", "31/02", "Flavin");

        show1.comecarEvento();
        show1.comecarEvento(true);

        standUp1.comecarEvento();
        standUp1.começarEvento("Oi, gente! Ja ouviram a piada do ponei? Nao? Po, nei eu...");
    }
}

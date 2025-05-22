package ro.cts.main;

import ro.cts.modules.Client;
import ro.cts.modules.IMetodaPlata;
import ro.cts.modules.PlataCard;
import ro.cts.modules.PlataCash;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata plataCard = new PlataCard(500);
        IMetodaPlata plataCash = new PlataCash();

        Client client = new Client("Maria");
        client.platesteNota(500);
        client.setMetodaPlata(plataCash);
        client.platesteNota(500);
    }
}

package ro.cts.main;

import ro.cts.modules.Bilet;
import ro.cts.modules.BiletZiNationala;
import ro.cts.modules.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet(5);
        IBilet biletDecorat = new BiletZiNationala(bilet);

        bilet.printeazaBilet();
        biletDecorat.printeazaBilet();
    }
}

package BuilderB2.main;

import BuilderB2.modules.IBuilder;
import BuilderB2.modules.Rezervare;
import BuilderB2.modules.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare1 = rezervareBuilder.build("Ion Popescu");
        Rezervare rezervare2 = rezervareBuilder.setAsezareGeam(true).setGenMuzica("latino").build("Maria Ionescu");

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}

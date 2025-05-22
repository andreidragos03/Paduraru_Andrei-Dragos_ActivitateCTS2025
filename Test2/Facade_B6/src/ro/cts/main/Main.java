package ro.cts.main;

import ro.cts.modules.Facade;
import ro.cts.modules.Masa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true);
        Masa masa2 = new Masa(2, false);
        Masa masa3 = new Masa(3, true);
        Masa masa4 = new Masa(4, true);

        List<Masa> mese = new ArrayList<>();
        mese.add(masa1);
        mese.add(masa2);
        mese.add(masa3);
        mese.add(masa4);

        Facade facade = new Facade();
        for (Masa masa:mese) {
            System.out.println(facade.verificaAranjareMasa(masa));
        }
    }
}

package FactoryMethodB3.Main;

import FactoryMethodB3.Factories.*;
import FactoryMethodB3.Modules.Mancare;

public class Main {
    public static void main(String[] args) {
        MancareFactory desertFactory = new DesertFactory("ciocolata");
        Mancare desert1 = desertFactory.getMancare(TipDesert.Clatite, 100, 500);
        Mancare desert2 = desertFactory.getMancare(TipDesert.Papanasi, 150, 300);
        Mancare desert3 = desertFactory.getMancare(TipDesert.Cheesecake, 120, 400);
        System.out.println(desert1.toString());
        System.out.println(desert2.toString());
        System.out.println(desert3.toString());

        MancareFactory supaFactory = new SupaFactory(100);
        Mancare supa1 = supaFactory.getMancare(TipSupa.Legume, 10, 170);
        Mancare supa2 = supaFactory.getMancare(TipSupa.Ciuperci, 9, 190);
        Mancare supa3 = supaFactory.getMancare(TipSupa.Vita, 11, 150);
        System.out.println(supa1.toString());
        System.out.println(supa2.toString());
        System.out.println(supa3.toString());
    }
}

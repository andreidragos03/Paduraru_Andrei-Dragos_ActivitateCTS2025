package PrototypeB4.main;

import PrototypeB4.modules.ARezervare;
import PrototypeB4.modules.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare1 = new Rezervare("Ion Popescu", 12, 2, 10, true);
        ARezervare rezervare2 = rezervare1.clonare(20);
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}

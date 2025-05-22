package ro.cts.main;

import ro.cts.models.Facade;

public class Main {
    public static void main(String[] args) {
        Facade fatada = new Facade();
        fatada.verificaInternare("Ionescu", 59, 3, 2);
        fatada.verificaInternare("Popescu", 80, 1, 1);
    }
}

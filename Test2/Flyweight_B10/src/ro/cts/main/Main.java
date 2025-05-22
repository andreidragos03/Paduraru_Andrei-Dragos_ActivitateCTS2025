package ro.cts.main;

import ro.cts.modules.CallCenter;
import ro.cts.modules.Rezervare;

public class Main {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

        callCenter.getClient("Andreea", "0711222222", "Adresa1");
        callCenter.getClient("Dragos", "0711223333", "Adresa2");

        Rezervare rezervare1 = new Rezervare(1, 2, "11:30");
        Rezervare rezervare2 = new Rezervare(2, 5, "10:00");

        try {
            callCenter.getClient("Andreea").detaliiClient(rezervare1);
            callCenter.getClient("Dragos").detaliiClient(rezervare2);
            callCenter.getClient("Nimeni").detaliiClient(rezervare1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

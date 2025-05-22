package ro.cts.main;

import ro.cts.modules.ClientFidel;
import ro.cts.modules.Observer;
import ro.cts.modules.Restaurant;
import ro.cts.modules.Subject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new ClientFidel("Andreea");
        Observer client2 = new ClientFidel("Dragos");
        Observer client3 = new ClientFidel("Blablabla");

        List<Observer> clienti = new ArrayList<>();
        Subject restaurant = new Restaurant("Casa Di David", clienti);
        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);
        restaurant.trimiteMesaj("Avem un peste nou!");
        restaurant.stergeObserver(client3);
        restaurant.trimiteMesaj("Avem si un desert nou!");
    }
}

package ro.cts.modules;

import java.util.List;

public class Restaurant implements Subject{
    private String nume;
    private List<Observer> clienti;

    public Restaurant(String nume, List<Observer> clienti) {
        this.nume = nume;
        this.clienti = clienti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Observer> getClienti() {
        return clienti;
    }

    public void setClienti(List<Observer> clienti) {
        this.clienti = clienti;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        clienti.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer client:clienti) {
            client.primesteMesaj(mesaj);
        }
    }
}

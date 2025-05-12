package ro.cts.modules;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject{
    private int nrLinie;
    private List<Observer> calatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<Observer>();
    }

    public void adaugaObserver(Observer observer) {
        calatori.add(observer);
    }
    public void stergeObserver(Observer observer) {
        calatori.remove(observer);
    }
    public void trimiteMesaj(String mesaj) {
        for(Observer calator:calatori) {
            calator.primesteMesaj(mesaj);
        }
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public List<Observer> getCalatori() {
        return calatori;
    }
}

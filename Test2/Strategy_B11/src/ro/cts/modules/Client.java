package ro.cts.modules;

public class Client {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCard(400);
    }

    public Client(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IMetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteNota (float total) {
        metodaPlata.plateste(total);
    }
}

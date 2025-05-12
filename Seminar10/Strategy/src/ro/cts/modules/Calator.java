package ro.cts.modules;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        metodaPlata = new CardBancar(10);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet) {
        metodaPlata.plateste(pretBilet);
    }
}

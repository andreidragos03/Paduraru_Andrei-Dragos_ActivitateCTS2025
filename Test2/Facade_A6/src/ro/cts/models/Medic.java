package ro.cts.models;

public class Medic {
    private String nume;
    private boolean confirmaInternare;

    public Medic(String nume, boolean confirmaInternare) {
        this.nume = nume;
        this.confirmaInternare = confirmaInternare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isConfirmaInternare() {
        return confirmaInternare;
    }

    public void setConfirmaInternare(boolean confirmaInternare) {
        this.confirmaInternare = confirmaInternare;
    }
}

package ro.cts.modules;

public class BiletTerestru {
    private float pret;
    private int nrCalatorii;

    public BiletTerestru(float pret, int nrCalatorii) {
        this.pret = pret;
        this.nrCalatorii = nrCalatorii;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    public void setNrCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public void cumparaBilet() {
        System.out.println("Ati cumparat un bilet in valoare de " + pret + " RON");
    }

    public void valideazaBilet() {
        if(nrCalatorii >= 0) {
            nrCalatorii -= 1;
            System.out.println("S-a validat o calatorie!");
        } else {
            System.out.println("Nu mai aveti calatorii disponibile!");
        }
    }
}

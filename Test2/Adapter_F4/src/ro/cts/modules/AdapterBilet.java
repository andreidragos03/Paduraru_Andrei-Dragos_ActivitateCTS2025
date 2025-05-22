package ro.cts.modules;

public class AdapterBilet extends BiletSubteran{
    private BiletTerestru bilet;
    public AdapterBilet(float pret, int nrCalatorii, boolean isStudent) {
        super(pret, nrCalatorii, isStudent);
    }

    public AdapterBilet(BiletTerestru bilet) {
        super(bilet.getPret(), bilet.getNrCalatorii(), false);
        this.bilet = bilet;
    }

    public void achizitioneazaBilet() {
        bilet.cumparaBilet();
    }
}

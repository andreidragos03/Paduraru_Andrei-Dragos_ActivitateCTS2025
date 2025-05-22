package ro.cts.modules;

public class BiletSubteran {
    private float pret;
    private int nrCalatorii;
    private boolean isStudent;

    public BiletSubteran(float pret, int nrCalatorii, boolean isStudent) {
        this.pret = pret;
        this.nrCalatorii = nrCalatorii;
        this.isStudent = isStudent;
    }

    public void achizitioneazaBilet() {
        if(isStudent) {
            System.out.println("Biletul este gratis!");
        } else {
            System.out.println("Biletul achizitionat are valoarea de " + pret + " RON");
        }
    }
}

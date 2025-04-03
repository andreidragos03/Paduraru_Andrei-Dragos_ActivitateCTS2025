package ro.cts.clase;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public MedicamentSpital(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicamentul "+nume+" costa "+pret);
    }

    public void prezintaReteta(){
        System.out.println("A fost aratata reteta");
    }
}

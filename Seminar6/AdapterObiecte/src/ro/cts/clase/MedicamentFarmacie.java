package ro.cts.clase;

public class MedicamentFarmacie {
    private String nume;
    private int pret;
    private boolean stoc;
    private String dataExpirare;

    public MedicamentFarmacie(String nume, int pret, boolean stoc, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul "+nume+" care costa "+pret+" care expira "+dataExpirare+" are stocul: "+stoc);
    }
}

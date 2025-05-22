package ro.cts.models;

public class SoftBar {
    private String numeProdus;
    private float pret;
    private int cantitate;

    public SoftBar(String numeProdus, float pret, int cantitate) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public void aduNota() {
        System.out.println("Produsul " + numeProdus + " comandat in cantitatea " + cantitate + " valoreaza " + pret*cantitate);
    }
}

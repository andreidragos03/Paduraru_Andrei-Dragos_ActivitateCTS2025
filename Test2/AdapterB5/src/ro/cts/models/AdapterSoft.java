package ro.cts.models;

public class AdapterSoft extends SoftBucatarie{
    private SoftBar softBar;

    public AdapterSoft(String numeProdus, float pret, int cantitate, int stoc) {
        super(numeProdus, pret, cantitate, stoc);
    }

    public AdapterSoft(SoftBar softBar) {
        super(softBar.getNumeProdus(), softBar.getPret(), softBar.getCantitate(), 100);
        this.softBar = softBar;
    }

    public void printeazaFactura() {
        softBar.aduNota();
    }
}

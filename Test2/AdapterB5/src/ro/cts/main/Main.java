package ro.cts.main;

import ro.cts.models.AdapterSoft;
import ro.cts.models.SoftBar;
import ro.cts.models.SoftBucatarie;

public class Main {

    public static void cereNota(SoftBucatarie softBucatarie) {
        softBucatarie.printeazaFactura();
    }
    public static void main(String[] args) {
        SoftBucatarie softBucatarie1 = new SoftBucatarie("Peste", 80, 1, 50);
        cereNota(softBucatarie1);

        SoftBar softBar1 = new SoftBar("Limonada", 25, 1);
        AdapterSoft adapterSoft = new AdapterSoft(softBar1);
        cereNota(adapterSoft);
    }
}

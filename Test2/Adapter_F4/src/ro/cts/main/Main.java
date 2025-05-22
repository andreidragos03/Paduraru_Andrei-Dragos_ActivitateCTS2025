package ro.cts.main;

import ro.cts.modules.AdapterBilet;
import ro.cts.modules.BiletSubteran;
import ro.cts.modules.BiletTerestru;

public class Main {
    public static void vindeBilet(BiletSubteran biletSubteran) {
        System.out.println("Va vindem biletul: ");
        biletSubteran.achizitioneazaBilet();
    }
    public static void main(String[] args) {
        BiletSubteran biletSubteran = new BiletSubteran(5, 1, false);
        vindeBilet(biletSubteran);

        BiletTerestru biletTerestru = new BiletTerestru(10, 3);
        vindeBilet(new AdapterBilet(biletTerestru));
    }
}

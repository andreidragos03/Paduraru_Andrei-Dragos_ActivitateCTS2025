package ro.cts.modules;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura{
    private String nume;
    private List<Structura> structuri;

    public Sectiune(String nume) {
        this.nume = nume;
        this.structuri = new ArrayList<Structura>();
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        this.structuri.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        this.structuri.remove(structura);
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        return this.structuri.get(index);
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectiunea " + nume + " contine urmatoarele subsectiuni: ");
        for (Structura structura:structuri) {
            structura.descriereStructura();
        }
    }
}

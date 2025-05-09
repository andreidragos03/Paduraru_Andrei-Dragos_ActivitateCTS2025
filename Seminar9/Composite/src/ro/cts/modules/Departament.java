package ro.cts.modules;

import java.util.ArrayList;
import java.util.List;


public class Departament extends StructuraAbs{

    private List<StructuraAbs> structuri;
    public Departament(String nume, int numarAngajati) {
        super(nume, numarAngajati);
        structuri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {
        structuri.add(structuraAbs);
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {
        structuri.remove(structuraAbs);
    }

    @Override
    public StructuraAbs getNodCopil(int indexCopil) {
        return structuri.get(indexCopil);
    }

    @Override
    public void afiseazaDescriere(String tab) {
        System.out.println(tab+ "Departamentul " + this.getNume() + " contine urmatoarele subdepartamente/sectii: ");
        for(StructuraAbs str:structuri){
            str.afiseazaDescriere(tab+"   ");
        }
    }

    @Override
    public int calculeazaNrAngajati() {
        int sum = 0;
        for(StructuraAbs structuraAbs : structuri){
            sum += structuraAbs.calculeazaNrAngajati();
        }
        return sum + this.getNumarAngajati();
    }
}

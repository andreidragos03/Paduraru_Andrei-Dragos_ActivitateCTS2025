package ro.cts.pachet.seminar2;


import java.util.Arrays;

public class Angajat extends Aplicant{
    private String ocupatie;
    private int salariu;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }
    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
    public Angajat() {
        super();
    }

    @Override
    public String toString() {
        return "Angajat: Nume=" + nume + ", Prenume=" + prenume
                + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
                + Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }
}
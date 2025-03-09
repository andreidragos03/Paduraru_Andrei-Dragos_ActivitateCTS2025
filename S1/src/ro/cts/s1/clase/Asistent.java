package ro.cts.s1.clase;

import ro.cts.s1.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;

    public Asistent() {
        super("N/A", 0);
        salariu = 0;
        idAsistent = 0;
    }

    public Asistent(String nume, int varsta, float salariu, int idAsistent) {
        super(nume, varsta);
        this.salariu = salariu;
        this.idAsistent = idAsistent;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public float calculareVenit() {
        return salariu;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Asistentul ");
        sb.append(this.getNume()).append(" în vârstă de ").append(this.varsta).append(" de ani predă la curs.");
        System.out.println(sb.toString());
    }
}

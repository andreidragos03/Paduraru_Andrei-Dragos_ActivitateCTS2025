package ro.cts.s1.clase;

import ro.cts.s1.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;
    private float sporVechime;

    public Profesor() {
        super("N/A", 0);
        idAsistent = 0;
        salariu = 0;
        sporVechime = 0;
    }

    public Profesor(String nume, int varsta, int idAsistent, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
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

    public float getSporVechime() {
        return sporVechime;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public float calculareVenit() {
        return salariu + sporVechime * salariu;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(this.getNume()).append(" în vârstă de ").append(this.varsta).append(" de ani predă la curs.");
        System.out.println(sb.toString());
    }
}
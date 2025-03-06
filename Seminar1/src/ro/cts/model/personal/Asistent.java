package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil{
    private int idAsistent;
    protected float ani;

    public Asistent(String nume, int varsta, int idAsistent, float ani) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.ani = ani;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public float getAni() {
        return ani;
    }

    public void setAni(float ani) {
        this.ani = ani;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Asistentul ");
        sb.append(super.getNume());
        sb.append(" preda de obicei la seminar");
        System.out.println(sb);
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Asistentul invata de ");
        sb.append(this.ani);
        sb.append(" ani");
        System.out.println(sb);
    }
}

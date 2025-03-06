package ro.cts.model.personal;

public class Student extends Persoana{

    private int idStudent;
    private int anStudiu;

    public Student(String nume, int varsta, int idStudent, int anStudiu) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.anStudiu = anStudiu;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Are ");
        sb.append(this.anStudiu);
        sb.append(" de studiu");
        System.out.println(sb);
    }
}

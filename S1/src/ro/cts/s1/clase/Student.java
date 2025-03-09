package ro.cts.s1.clase;

public class Student extends Persoana{
    private int idStudent;

    public Student() {
        super("N/A", 0);
        idStudent = 0;
    }

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public float calculareVenit() {
        return 0;
    }
}
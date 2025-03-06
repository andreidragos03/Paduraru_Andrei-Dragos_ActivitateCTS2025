package ro.cts.model.platforma;

import ro.cts.model.personal.IPersoana;
import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs(String numeCurs, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void sustineExamen(){
        StringBuilder sb = new StringBuilder("Cadrul didactic ");
        sb.append(((IPersoana)this.cadruDidactic).getNume()).append(" are examen la materia ").append(this.numeCurs)
                .append(" cu urmatorii studenti :");
        System.out.println(sb);
        for(Student student: studenti){
            System.out.println(student.getNume());
        }
    }
}

package ro.cts.s1.clase;

import ro.cts.s1.interfete.IPersoana;
import ro.cts.s1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs() {
        numeCurs = "N/A";
        credite = 0;
        profesor = new Profesor();
        studenti = new ArrayList<>();
    }

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void afisareDetalii(){
        StringBuilder sb = new StringBuilder("La cursul ");
        sb.append(this.numeCurs).append(" cu ").append(this.credite).append(" credite predat de ")
                .append(((IPersoana)this.profesor).getNume()).append(" are ")
                .append(studenti.size()).append(" studenti.");
        System.out.println(sb.toString());
    }

    public void sustinereExamen(String data){
        StringBuilder sb = new StringBuilder("Pe data ");
        sb.append(data).append(" cadrul didactic ").append(((IPersoana)this.profesor).getNume())
                .append(" sustine examenul pentru urmatorii studenti: ");
        System.out.print(sb.toString());
        studenti.forEach(s -> System.out.print(s.getNume() + ", "));
        System.out.println();
    }
}
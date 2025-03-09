package ro.cts.s1;

import ro.cts.s1.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Andrei", 20, 1));
        studenti.add(new Student("Adrian", 21, 2));
        Curs curs = new Curs("CTS", 5, new Profesor("Dragos", 25, 1, 6000, 0.2f), studenti);
        System.out.println(((Persoana)curs.getProfesor()).calculareVenit());
        curs.sustinereExamen("27/02/2025");
        Asistent asistent = new Asistent("Ciprian", 23, 1, 4000);
        curs.getProfesor().preda();
        curs.setProfesor(asistent);
        curs.sustinereExamen("27/06/2025");
        curs.getProfesor().preda();
    }
}
package seminar13.tests;

import org.junit.Test;
import seminar13.Persoana;

import static org.junit.Assert.*;

public class GetSexTest {

    @Test
    public void getSexRight1() {
        Persoana persoana = new Persoana("Ion Popa", "1990101123456");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRight2() {
        Persoana persoana = new Persoana("Ioana Popa", "2990101123456");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexBoundary() {
        Persoana persoana = new Persoana("Ioana Popa", "8990101123456");
        assertEquals("F", persoana.getSex());
    }
}
package seminar13.tests;

import org.junit.Before;
import org.junit.Test;
import seminar13.exceptii.ExceptieCNPInexistent;
import seminar13.exceptii.ExceptieCNPInvalid;
import seminar13.Persoana;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;

    @Before
    public void setUp() throws Exception {
        this.persoana = new Persoana();
    }

    @Test
    public void getVarstaRight1() {
        this.persoana = new Persoana("Ioana Popa", "6021223232323");
        assertEquals(22,this.persoana.getVarsta());
    }

    @Test
    public void getVarstaRight2() {
        this.persoana = new Persoana("Ion Popa", "1980423232323");
        assertEquals(27,this.persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundary1() {
        this.persoana = new Persoana("Ion Popa", "1991231232323");
        assertEquals(25,this.persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundary2() {
        this.persoana = new Persoana("Ion Popa", "5000101232323");
        assertEquals(25,this.persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaErrorCondition1() {
        this.persoana = new Persoana("Ion Popa", "5001401232323");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaErrorCondition2() {
        this.persoana = new Persoana("Ion Popa", "500AA01232323");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance1() {
        this.persoana = new Persoana("Ion Popa", "5001101232323");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaConformance1() {
        this.persoana = new Persoana("Ion Popa", "123");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder1() {
        Persoana persoana1 = new Persoana("Ion Popa", "5001101232323");
        Persoana persoana2 = new Persoana("Andrei Popa", "1991101232323");
        assertTrue(persoana2.getVarsta()>persoana1.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExistence() {
    this.persoana = new Persoana("Ion Popa", null);
    persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality0() {
        this.persoana = new Persoana("Ion Popa", "5250101232323");
        assertEquals(0, this.persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality1() {
        this.persoana = new Persoana("Ion Popa", "5240101232323");
        assertEquals(1, this.persoana.getVarsta());
    }
}
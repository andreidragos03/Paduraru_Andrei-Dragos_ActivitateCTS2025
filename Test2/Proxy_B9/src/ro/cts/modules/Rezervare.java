package ro.cts.modules;

public class Rezervare implements IRezervare{
    @Override
    public void efectueazaRezervare(String nume, int nrPersoane) {
        System.out.println("S-a efectuat rezervarea pe numele " + nume + " pentru " + nrPersoane + " persoane");
    }
}

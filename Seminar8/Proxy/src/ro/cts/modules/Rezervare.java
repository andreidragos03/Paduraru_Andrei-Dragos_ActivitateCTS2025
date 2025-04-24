package ro.cts.modules;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        System.out.println("Rezervarea clientului " + numeClient + " pentru " + nrPersoane + " persoane de la ora " + ora);
    }
}

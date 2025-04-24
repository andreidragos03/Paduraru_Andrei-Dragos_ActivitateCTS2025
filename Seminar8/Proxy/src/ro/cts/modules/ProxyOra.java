package ro.cts.modules;

public class ProxyOra implements IRezervare{
    private IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(ora >= 18) {
            this.rezervare.rezerva(numeClient, nrPersoane, ora);
        } else {
            System.out.println("Nu este nevoie de rezervare!");
        }
    }
}

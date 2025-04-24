package ro.cts.modules;

public class ProxyNrPersoane implements IRezervare{
    private IRezervare rezervare;

    public ProxyNrPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(nrPersoane>4) {
            this.rezervare.rezerva(numeClient, nrPersoane, ora);
        } else {
            System.out.println("Va asteptam la restaurant!");
        }
    }
}

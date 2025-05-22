package ro.cts.modules;

public class RezervareProxy implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }


    @Override
    public void efectueazaRezervare(String nume, int nrPersoane) {
        if(nrPersoane>=4) {
            rezervare.efectueazaRezervare(nume, nrPersoane);
        } else {
            System.out.println("Nu e nevoie de rezervare!");
        }
    }
}

package ro.cts.modules;

public class ClientFidel implements Observer{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + ", ai primit un mesaj: " + mesaj);
    }
}

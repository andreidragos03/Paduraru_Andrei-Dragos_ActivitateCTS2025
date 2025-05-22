package ro.cts.modules;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Client(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void detaliiClient(Rezervare rezervare) {
        System.out.println("Clientul " + nume + " cu numarul de telefon " + nrTelefon + " si adresa " + adresa);
        System.out.println(rezervare.toString());
    }
}

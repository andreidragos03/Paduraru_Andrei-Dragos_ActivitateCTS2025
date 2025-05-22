package ro.cts.modules;

public class Masa extends AMasa{
    public Masa(int nrMasa) {
        super(nrMasa);
    }

    @Override
    protected void curataMasa() {
        System.out.println("S-a curatat masa");
    }

    @Override
    protected void asazaServetele() {
        System.out.println("S-au asezat servetelele");
    }

    @Override
    protected void asazaTacamuri() {
        System.out.println("S-au asezat tacamurile");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Au fost invitate persoanele");
    }
}

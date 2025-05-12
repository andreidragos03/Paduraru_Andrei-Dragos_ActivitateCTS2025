package ro.cts.modules;

import java.util.List;

public class Autobuz extends MijlocTransport{
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul numarul " + this.getNrLinie() + " pleaca de la capatul liniei!");
    }

    public void schimbaTraseul() {
        trimiteMesaj("Autobuzul cu numarul " + this.getNrLinie() + " va circula astazi pe bulevardul Balcescu si nu va mai opri in Piata Romana.");
    }
}

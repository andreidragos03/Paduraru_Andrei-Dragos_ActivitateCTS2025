package ro.cts.modules;

public class Ospatar {
    public boolean esteAranjataMasa(Masa masa){
        return masa.getNrMasa() % 5 == 0;
    }
}

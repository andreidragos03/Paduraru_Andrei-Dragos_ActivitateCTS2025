package ro.cts.modules;

public class PlataCash implements IMetodaPlata{
    @Override
    public void plateste(float total) {
        System.out.println("Ati platit cash suma de " + total + " RON");
    }
}

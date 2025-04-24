package ro.cts.modules;

public class NotaDePlata implements Nota{
    private float totalDePlata;

    public NotaDePlata(float totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata " + totalDePlata + " RON");
    }
}

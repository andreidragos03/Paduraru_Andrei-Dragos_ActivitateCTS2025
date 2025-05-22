package ro.cts.modules;

public class Bilet implements IBilet{
    private float suma;

    public Bilet(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul costa " + suma + " RON");
    }
}

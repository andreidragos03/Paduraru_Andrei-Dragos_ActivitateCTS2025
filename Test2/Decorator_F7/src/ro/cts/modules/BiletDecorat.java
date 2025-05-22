package ro.cts.modules;

public abstract class BiletDecorat implements IBilet {
    private IBilet bilet;

    public BiletDecorat(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
        printeazaMesajSpecial();
    }

    public abstract void printeazaMesajSpecial();
}

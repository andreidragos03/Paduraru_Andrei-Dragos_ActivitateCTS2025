package ro.cts.modules;

public class BiletZiNationala extends BiletDecorat{
    public BiletZiNationala(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaMesajSpecial() {
        System.out.println("La multi ani!");
    }
}

package ro.cts.modules;

public class CardBancar implements IMetodaPlata{
    float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold >= pretBilet) {
            System.out.println("Ai platit cu cardul bancar!");
            sold -= pretBilet;
        } else {
            System.out.println("Sold insuficient!");
        }
    }
}

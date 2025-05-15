package ro.cts.models;

public class InfoTroleibuz extends AInfoTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta < 3) {
            System.out.println("Este recomandat sa luati troleibuzul!");
        } else {
            super.getNext().recomandaTransport(distanta);
        }
    }
}

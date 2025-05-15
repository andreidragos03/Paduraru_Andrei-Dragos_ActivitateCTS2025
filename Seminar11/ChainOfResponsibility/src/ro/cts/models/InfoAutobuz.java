package ro.cts.models;

public class InfoAutobuz extends AInfoTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta < 5) {
            System.out.println("Este recomandat sa luati autobuzul!");
        } else {
            super.getNext().recomandaTransport(distanta);
        }
    }
}

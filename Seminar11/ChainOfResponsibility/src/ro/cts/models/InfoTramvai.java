package ro.cts.models;

public class InfoTramvai extends AInfoTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta < 10) {
            System.out.println("Este recomandat sa luati tramvaiul!");
        } else {
            super.getNext().recomandaTransport(distanta);
        }
    }
}

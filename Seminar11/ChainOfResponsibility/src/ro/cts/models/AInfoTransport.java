package ro.cts.models;

public abstract class AInfoTransport {
    private AInfoTransport next;

    protected AInfoTransport getNext() {
        return next;
    }

    public void setNext(AInfoTransport next) {
        this.next = next;
    }

    public abstract void recomandaTransport(int distanta);
}

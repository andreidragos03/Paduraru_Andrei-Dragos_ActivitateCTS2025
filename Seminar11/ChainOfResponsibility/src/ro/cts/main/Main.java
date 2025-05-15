package ro.cts.main;

import ro.cts.models.*;

public class Main {
    public static void main(String[] args) {
        AInfoTransport troleibuz = new InfoTroleibuz();
        AInfoTransport autobuz = new InfoAutobuz();
        AInfoTransport tramvai = new InfoTramvai();
        AInfoTransport metrou = new InfoMetrou();

        troleibuz.setNext(tramvai);

        tramvai.setNext(metrou);

        troleibuz.recomandaTransport(2);
        troleibuz.recomandaTransport(12);
        troleibuz.recomandaTransport(7);
        troleibuz.recomandaTransport(4);
    }
}

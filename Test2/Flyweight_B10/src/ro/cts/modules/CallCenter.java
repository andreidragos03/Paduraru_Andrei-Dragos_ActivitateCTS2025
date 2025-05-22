package ro.cts.modules;

import java.util.HashMap;

public class CallCenter {
    private HashMap<String, IClient> clienti;

    public CallCenter() {
        this.clienti = new HashMap<String, IClient>();
    }

    public IClient getClient(String nume, String nrTelefon, String adresa) {
        if(!clienti.containsKey(nume)) {
            clienti.put(nume, new Client(nume, nrTelefon, adresa));
        }
        return clienti.get(nume);
    }

    public IClient getClient(String nume) throws Exception{
        if(clienti.containsKey(nume)) {
           return clienti.get(nume);
        } else {
            throw new Exception("Pacientul cu numele " + nume + " nu exista");
        }
    }
}

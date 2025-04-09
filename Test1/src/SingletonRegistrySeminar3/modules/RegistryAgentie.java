package SingletonRegistrySeminar3.modules;

import java.util.HashMap;
import java.util.Map;

public class RegistryAgentie {
    private String nume;
    private Map<String, Anunt> anunturi = new HashMap<>();

    public RegistryAgentie(String nume) {
        this.nume = nume;
    }

    public Anunt getAnunt(String adresa, Anunt anunt)  {
        if(!(anunturi.containsKey(adresa))) {
            anunturi.put(adresa, anunt);
        }
        return anunturi.get(adresa);
    }
}

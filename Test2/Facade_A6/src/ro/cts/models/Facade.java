package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    public void verificaInternare(String numePacient, int varsta, int gradBolnav, int pat) {
        Medic medic = new Medic("Andrei", false);
        Pacient pacient1 = new Pacient(numePacient, varsta, gradBolnav);
        List<Boolean> paturi = new ArrayList<>();
        Salon salon = new Salon(paturi);
        paturi.add(true);
        paturi.add(false);
        paturi.add(true);
        paturi.add(false);

        pacient1.verificaGravitate();
        if(pacient1.getGradBolnav() == 3) {
            medic.setConfirmaInternare(true);
            System.out.println("Pacientul trebuie sa fie internat!");
            if(salon.disponibilitatePat(pat)) {
                System.out.println("Am gasit disponibilitate in patul " + pat + "!");
            } else {
                System.out.println("Patul selectat nu e liber!");
            }
        } else {
            System.out.println("Pacientul nu trebuie sa fie internat!");
        }
    }
}

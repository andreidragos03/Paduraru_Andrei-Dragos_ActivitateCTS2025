package ro.cts.main;

import ro.cts.clase.AdaptorMedicament;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Medi", 50, true, "11.02.2029");
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Medi2", 45);
        AdaptorMedicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        vindeMedicamente(adaptorMedicament);
    }
}

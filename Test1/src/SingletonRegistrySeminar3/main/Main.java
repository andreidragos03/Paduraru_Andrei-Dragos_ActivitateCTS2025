package SingletonRegistrySeminar3.main;

import SingletonRegistrySeminar3.modules.*;

public class Main {
    public static void main(String[] args) {

        RegistryAgentie agentie = new RegistryAgentie("AgentieImobiliara");
        AnuntTeren anuntTeren = new AnuntTeren();
        AnuntCasa anuntCasa = new AnuntCasa();
        AnuntApartament anuntApartament = new AnuntApartament();
        agentie.getAnunt("Otopeni", anuntTeren).descriere();
        agentie.getAnunt("Otopeni", anuntCasa).descriere();
    }
}

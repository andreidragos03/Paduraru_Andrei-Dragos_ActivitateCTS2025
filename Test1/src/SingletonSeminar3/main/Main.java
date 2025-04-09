package SingletonSeminar3.main;

import SingletonSeminar3.modules.AgentieImobiliaraEagerInitialization;
import SingletonSeminar3.modules.AgentieImobiliaraLazyInitialization;
import SingletonSeminar3.modules.AgentieImobiliaraThreadSafeInitialization;

public class Main {
    public static void main(String[] args) {

        //Eager Initialization
        AgentieImobiliaraEagerInitialization agentieImobiliaraEagerInitialization = AgentieImobiliaraEagerInitialization.getInstance();
        System.out.println(agentieImobiliaraEagerInitialization.toString());

        AgentieImobiliaraEagerInitialization agentie2 = AgentieImobiliaraEagerInitialization.getInstance();
        agentie2.setSite("Sitenou");
        System.out.println(agentieImobiliaraEagerInitialization.toString());

        //Lazy Initialization
        AgentieImobiliaraLazyInitialization agentieLazy1 = AgentieImobiliaraLazyInitialization.getInstance("AgentiaLazy", 100, "SiteLazy", 50000);
        System.out.println(agentieLazy1);

        AgentieImobiliaraLazyInitialization agentieLazy2 = AgentieImobiliaraLazyInitialization.getInstance("AgentiaNoua", 120, "Siteulnou", 400000);
        System.out.println(agentieLazy2);
        agentieLazy2.setSite("SiteNouLazy.com");
        System.out.println(agentieLazy1);

        //ThreadSafe Initialization
        AgentieImobiliaraThreadSafeInitialization agentieSafe1 = AgentieImobiliaraThreadSafeInitialization.getInstance("Agentie Safe1", 50, "Site mic", 500000);
        AgentieImobiliaraThreadSafeInitialization agentieSafe2 = AgentieImobiliaraThreadSafeInitialization.getInstance("Agentie Safe 2", 15, "Site mai mic", 200000);
        System.out.println(agentieSafe1.toString());
        System.out.println(agentieSafe2.toString());

    }
}

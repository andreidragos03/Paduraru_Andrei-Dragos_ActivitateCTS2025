package ro.cts.pachet.seminar3.main;

import ro.cts.pachet.seminar3.AgentieImobiliaraEager;
import ro.cts.pachet.seminar3.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {
        AgentieImobiliaraEager agentieImobiliara= AgentieImobiliaraEager.getAgentieImobiliara();
        System.out.println(agentieImobiliara.toString());

        AgentieImobiliaraEager agentie2= AgentieImobiliaraEager.getAgentieImobiliara();
        agentie2.setSite("sitenou.com");
        agentie2.posteazaAnunt("anunt2");
        agentieImobiliara.posteazaAnunt("anunt1");
        System.out.println(agentieImobiliara.toString());


        AgentieImobiliaraLazy agentie4 = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Remax", 10, "site agentie 4.com", 150000);
        AgentieImobiliaraLazy agentie5 = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("One", 100, "siteOne.com", 1000000);
        System.out.println(agentie5.toString());
    }
}
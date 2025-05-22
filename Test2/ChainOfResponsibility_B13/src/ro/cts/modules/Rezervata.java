package ro.cts.modules;

public class Rezervata extends Handler{
    @Override
    public void gestioneazaMasa(int pas) {
        if(pas == 1) {
            System.out.println("Masa este rezervata!");
        } else if(this.urmatorul != null) {
            this.urmatorul.gestioneazaMasa(pas);
        }
    }
}

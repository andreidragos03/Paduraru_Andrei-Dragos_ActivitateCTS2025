package ro.cts.modules;

public class Ocupata extends Handler{
    @Override
    public void gestioneazaMasa(int pas) {
        if(pas == 2) {
            System.out.println("Masa este ocupata!");
        } else if(this.urmatorul != null) {
            this.urmatorul.gestioneazaMasa(pas);
        }
    }
}

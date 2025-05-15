package ro.cts.models;

public class Tramvai extends TramvaiAbs{
    private int nrTramvai;

    public Tramvai(int nrTramvai) {
        this.nrTramvai = nrTramvai;
    }

    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul " + nrTramvai + " opreste in statia 1!");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul " + nrTramvai + " opreste in statia 2!");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul " + nrTramvai + " opreste in statia 3!");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul " + nrTramvai + " opreste in statia 4!");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul " + nrTramvai + " opreste in statia 5!");
    }
}

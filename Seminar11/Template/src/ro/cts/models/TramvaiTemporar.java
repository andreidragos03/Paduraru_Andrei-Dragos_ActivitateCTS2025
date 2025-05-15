package ro.cts.models;

public class TramvaiTemporar extends TramvaiAbs{
    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul opreste in statia 1!");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul opreste in statia 2!");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul nu opreste in statia 3, sunt lucrari!");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul opreste in statia 4!");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul nu opreste in statia 5, sunt lucrari!");
    }

}

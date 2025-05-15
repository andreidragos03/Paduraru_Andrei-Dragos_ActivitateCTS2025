package ro.cts.models;

public abstract class TramvaiAbs {
    protected abstract void opresteStatie1();
    protected abstract void opresteStatie2();
    protected abstract void opresteStatie3();
    protected abstract void opresteStatie4();
    protected abstract void opresteStatie5();

    public final void parcurgeTur() {
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
        opresteStatie4();
        opresteStatie5();
    }

    public final void parcurgeRetur() {
        opresteStatie5();
        opresteStatie4();
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }
}

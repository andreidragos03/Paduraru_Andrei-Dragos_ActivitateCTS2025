package ro.cts.modules;

public class Facade {
    public String verificaAranjareMasa(Masa masa) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if(masa.isEsteLibera()) {
            if(picolo.esteDebarasata(masa)) {
                if(ospatar.esteAranjata(masa)) {
                    return "Puteti lua loc la masa " + masa.getNrMasa();
                } else {
                    return "Asteptati, masa " + masa.getNrMasa() + " nu este inca aranjata";
                }
            } else {
                return "Asteptati, masa " + masa.getNrMasa() + " nu este inca debarasata";
            }
        } else {
            return "Masa " + masa.getNrMasa() + " nu este libera";
        }
    }
}

package ro.cts.main;

import ro.cts.modules.Departament;
import ro.cts.modules.Sectie;
import ro.cts.modules.StructuraAbs;

public class Main {
    public static void main(String[] args) {
        StructuraAbs departament1 = new Departament("Dermatologie", 10);
        StructuraAbs departament2 = new Departament("Cardiologie", 20);

        StructuraAbs sectie1 = new Sectie("Dermato Cosmetica", 5);
        StructuraAbs sectie2 = new Sectie("Dermato Injectari", 5);
        StructuraAbs sectie3 = new Sectie("Cardiologie Consultatii", 10);

        departament1.adaugaNod(departament2);
        departament1.adaugaNod(sectie1);
        departament1.adaugaNod(sectie2);
        departament2.adaugaNod(sectie3);

        departament1.afiseazaDescriere("");

        System.out.println(departament1.calculeazaNrAngajati());
    }
}

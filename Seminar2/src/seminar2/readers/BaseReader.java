package seminar2.readers;

import ro.cts.pachet.seminar2.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseReader {
    protected String fileName;

    public BaseReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void citireAplicant(Aplicant aplicant, Scanner input2){
        String nume = input2.next();
        String prenume = (input2.next()).toString();
        int varsta = Integer.valueOf(input2.nextInt());
        int punctaj = Integer.valueOf(input2.nextInt());
        int nr = Integer.valueOf(input2.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNrProiecte(nr, vect);
    }
}

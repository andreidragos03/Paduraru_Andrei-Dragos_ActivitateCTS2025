package ro.cts.models;

public class Pacient {
    private String nume;
    private int varsta;
    private int gradBolnav;

    public Pacient(String nume, int varsta, int gradBolnav) {
        this.nume = nume;
        this.varsta = varsta;
        this.gradBolnav = gradBolnav;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGradBolnav(int gradBolnav) {
        this.gradBolnav = gradBolnav;
    }

    public int getGradBolnav() {
        return gradBolnav;
    }

    public void verificaGravitate() {
        if(gradBolnav == 1) {
            System.out.println("E sanatos!");
        } else if (gradBolnav == 2) {
            System.out.println("E mediu!");
        } else {
            System.out.println("E grav!");
        }
    }
}

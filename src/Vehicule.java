public class Vehicule {
    private Marque marque;
    private String numImmat;
    private int vitesseMax = 100;
    private int vitesseActuelle = 0;

    public Vehicule(Marque marque, String numImmat, int vitesseActuelle) {
        this.marque = marque;
        this.numImmat = numImmat;
        this.vitesseActuelle = vitesseActuelle;
    }

    public void accelerer(int n) {
        if (vitesseActuelle + n < vitesseMax) {
            vitesseActuelle += n;
        }
        else {
            vitesseActuelle = vitesseMax;
        }
    }

    public void freiner(int n) {
        if (vitesseActuelle - n > 0) {
            vitesseActuelle -= n;
        }
        else {
            vitesseActuelle = 0;
        }
    }
    

    public Marque getMarque() {
        return marque;
    }

    public String getNumImmat() {
        return numImmat;
    }

    public int getVitesseActuelle() {
        return vitesseActuelle;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    @Override
    public String toString() {
        return "Vehicule [marque=" + marque + ", numImmat=" + numImmat + ", vitesseMax=" + vitesseMax
                + ", vitesseActuelle=" + vitesseActuelle + "]";
    }

    

    


}

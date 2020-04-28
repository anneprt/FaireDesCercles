package fr.abp.cours;

public class Forme implements CalculGeometrique {
    protected int x;
    protected int y;
    private int couleur;

    public Forme(int nx, int ny) {
        x = nx;
        y = ny;
        couleur = 0;
    }

    public double surface() {
        return -1;
    }

    public double perimetre() {
        return -1;
    }

    public void afficher() {
        System.out.println("Position en " + x + ", " + y);
        System.out.println("Couleur : " + couleur);
    }

    public void échangerAvec(Forme autre) {
        int tmp;
        tmp = x;
        x = autre.x;
        autre.x = tmp;
        tmp = y;
        y = autre.y;
        autre.y = tmp;
    }

    public void déplacer(int nx, int ny) {
        x = nx;
        y = ny;
    }
}

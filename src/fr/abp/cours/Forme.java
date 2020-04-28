package fr.abp.cours;

public class Forme {
    protected int x;
    protected int y;
    private int couleur;

    public Forme(int nx, int ny) {
        x = nx;
        y = ny;
        couleur = 0;
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

package fr.abp.cours;

public class CerclePrive {
    private int x;
    private int y;
    private int r;

    public void afficher() {
        System.out.println("fr.abp.cours.Cercle centré en " + x + "," + y);
        System.out.println("de rayon: " + r);
    }

    public double perimetre() {
        return 2 * Math.PI * r;
    }

    public void deplacer(int nx, int ny) {
        x = nx;
        y = ny;
    }

    public void agrandir(int nr) {
        r = r + nr;
    }
}

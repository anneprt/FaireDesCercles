package fr.abp.cours;

public class FormerDesCercles {
    public static void main(String[] args) {
        Cercle A = new Cercle(5, 5);
        A.afficher();
        if (A.perimetre() >= 0) {
            System.out.println("Le périmètre de A : " + A.perimetre());
        } else {
            System.out.println("Calcul impossible");
        }
        Forme F = new Forme(10, 10);
        F.afficher();
        if (F.perimetre() >= 0) {
            System.out.println("Le périmètre de F : " + F.perimetre());
        } else {
            System.out.println("Calcul impossible");
        }
    }
}


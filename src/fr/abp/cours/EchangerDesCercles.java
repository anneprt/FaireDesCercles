package fr.abp.cours;

public class EchangerDesCercles {

    public static void main(String[] args) {
        Cercle A = new Cercle();
        A.creer();
        System.out.println("Le cercle A: ");

        Cercle B = new Cercle();
        B.creer();
        System.out.println("Le cercle B:  ");

        B.echanger(A);
        System.out.println("Après échange ");
        System.out.println("Le cercle A: ");
        A.afficher();
        System.out.println("Le cercle B: ");
        B.afficher();
    }
}

package fr.abp.cours;

import java.util.Scanner;

public class Cercle extends Forme {
    public final static int TAILLE_ECRAN = 600;
    private int r;

    public Cercle(int xx, int yy) {
        super(xx, yy);
        System.out.print("Rayon          :  ");
        r = rayonVérifié();
    }

    public void afficher() {
        super.afficher();
        System.out.println("Rayon : " + r);
    }

    private int rayonVérifié() {
        Scanner lectureClavier = new Scanner(System.in);
        int tmp;
        do {
            System.out.print("Rayon            :  ");
            tmp = lectureClavier.nextInt();
        } while (tmp < 0 || tmp > TAILLE_ECRAN);
        return tmp;
    }

    private int rayonVérifié(int tmp) {
        if (tmp < 0) return 0;
        else if (tmp > TAILLE_ECRAN) return TAILLE_ECRAN;
        else return tmp;
    }

    public void echanger(Cercle autre) {
        int tmp;
        tmp = x;
        x = autre.x;
        autre.x = tmp;
        tmp = y;
        y = autre.y;
        autre.y = tmp;

    }

    public double perimetre() {
        return 2 * Math.PI * r;
    }

    public double surface() {
        return Math.PI * r * r;
    }

    public void agrandir(int nr) {
        r = rayonVérifié(r + nr);
    }
}


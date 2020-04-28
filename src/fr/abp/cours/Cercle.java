package fr.abp.cours;

import java.util.Scanner;

public class Cercle extends Forme {

    public static int nombre;
    public int x;
    public int y;
    private int r;
    public final static int TAILLE_ECRAN = 600;

    public Cercle(int xx, int yy) {
        super(xx, yy);
        System.out.print("Rayon          :  ");
        r = rayonVérifié();
    }

    private int rayonVérifié() {
        int tmp;
        do {
            System.out.print("Rayon            :  ");
            Scanner lectureClavier = new Scanner(System.in);
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

    public void creer() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Position en x:   ");
        x = lectureClavier.nextInt();
        System.out.println("Position en y:   ");
        y = lectureClavier.nextInt();
        System.out.println("Rayon        :   ");
        r = lectureClavier.nextInt();
        nombre++;
    }

    public void afficher() {
        super.afficher();
    }

    public double perimetre() {
        return 2 * Math.PI * r;
    }

    public void deplacer(int nx, int ny) {
        x = nx;
        y = ny;
    }

    public void agrandir(int nr) {
        r = rayonVérifié(r + nr);
    }
}


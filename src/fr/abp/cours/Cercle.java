package fr.abp.cours;

import java.util.Scanner;

public class Cercle {

    public static int nombre;
    public int x;
    public int y;
    public int r;

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


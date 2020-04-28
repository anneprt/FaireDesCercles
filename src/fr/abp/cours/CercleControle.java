package fr.abp.cours;

import java.util.Scanner;

public class CercleControle {
    int x;
    int y;
    int r;

    public void créer() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Position en x :  ");
        x = lectureClavier.nextInt();
        System.out.print("Position en y :  ");
        y = lectureClavier.nextInt();
        do {
            System.out.print("Rayon         :  ");
            r = lectureClavier.nextInt();
        } while (r < 0 || r > 600);
    }

    public void afficher() {
        System.out.println("Centre en " + x + ", " + y);
        System.out.println("Rayon : " + r);
    }

    public void agrandir(int nr) {
        if (r + nr < 0) r = 0;
        else if (r + nr > 600) r = 600;
        else r = r + nr;
    }

}

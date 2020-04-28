package fr.abp.cours;

import java.util.Scanner;

public class FaireDesCerclesControle {
    public static void main(String[] args) {

        Scanner lectureClavier = new Scanner(System.in);
        CercleControle A = new CercleControle();
        A.créer();
        A.afficher();
        System.out.print("Entrer une valeur d'agrandissement : ");
        int plus = lectureClavier.nextInt();
        A.agrandir(plus);
        System.out.println("Après agrandissement : ");
        A.afficher();
    }

}

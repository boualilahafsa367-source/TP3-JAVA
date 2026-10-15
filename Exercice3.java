
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // Lire le nombre de valeurs à calculer
        System.out.print("Combien de valeurs : ");
        int n = clavier.nextInt();

        // Créer un tableau pour stocker les carrés
        int[] carres = new int[n];

        int impair = 1;
        int i = 0;

        // Calculer les carrés des n premiers nombres impairs
        while (i < n) {
            carres[i] = impair * impair;
            impair = impair + 2;
            i++;
        }

        // Afficher chaque nombre impair et son carré
        impair = 1;
        i = 0;

        while (i < n) {
            System.out.println(impair + " a pour carre " + carres[i]);
            impair = impair + 2;
            i++;
        }

        clavier.close();
    }
}


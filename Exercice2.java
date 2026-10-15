
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // Lire la hauteur du triangle
        System.out.print("Donner la hauteur du triangle : ");
        int n = clavier.nextInt();

        int ligne = 1;

        // Parcourir les lignes du triangle
        while (ligne <= n) {
            int espaces = n - ligne;
            int etoiles = 2 * ligne - 1;

            // Afficher les espaces avant les étoiles
            while (espaces > 0) {
                System.out.print(" ");
                espaces--;
            }

            // Afficher les étoiles de la ligne
            while (etoiles > 0) {
                System.out.print("*");
                etoiles--;
            }

            System.out.println();
            ligne++;
        }

        clavier.close();
    }
}

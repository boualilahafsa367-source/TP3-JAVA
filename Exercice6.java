
import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // Lecture de la taille du tableau et de la fenetre
        System.out.println("=== Nombre de valeurs distinctes par fenetre ===");
        System.out.print("Donner n (taille du tableau) et k (taille de la fenetre) : ");

        int n = clavier.nextInt();
        int k = clavier.nextInt();

        // Lecture des elements du tableau
        int[] T = new int[n];

        System.out.println("Donner les " + n + " elements du tableau (entre 0 et 100000) :");

        int i = 0;
        while (i < n) {
            T[i] = clavier.nextInt();
            i++;
        }

        // Tableau de frequences pour les valeurs de 0 a 100000
        int[] freq = new int[100001];
        int distinct = 0;

        // Calcul des valeurs distinctes dans la premiere fenetre
        i = 0;

        while (i < k) {
            int x = T[i];

            if (freq[x] == 0) {
                distinct++;
            }

            freq[x]++;
            i++;
        }

        // Affichage du nombre de valeurs distinctes de la premiere fenetre
        System.out.println();
        System.out.println("Nombre de valeurs distinctes dans chaque fenetre :");
        System.out.print(distinct);

        // Deplacement de la fenetre vers la droite
        i = k;

        while (i < n) {

            // Retirer l'element qui quitte la fenetre
            int sortant = T[i - k];
            freq[sortant]--;

            if (freq[sortant] == 0) {
                distinct--;
            }

            // Ajouter le nouvel element dans la fenetre
            int entrant = T[i];

            if (freq[entrant] == 0) {
                distinct++;
            }

            freq[entrant]++;

            // Afficher le nombre de valeurs distinctes
            System.out.print(" " + distinct);

            i++;
        }

        System.out.println();
        System.out.println("Chaque nombre correspond a une fenetre successive de taille " + k + ".");

        clavier.close();
    }
}


import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // Lire le nombre de termes
        System.out.print("Donner la valeur de n : ");
        int n = clavier.nextInt();

        double somme = 0.0;
        int i = 1;

        // Calculer la somme des n premiers termes
        while (i <= n) {
            somme = somme + 1.0 / i;
            i++;
        }

        // Afficher le résultat
        System.out.println("La somme est : " + somme);

        clavier.close();
    }
}

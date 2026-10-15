package Exercice5;


import java.util.Scanner;

public class RotationMatrice {

    // Fait pivoter la matrice de 90 degres dans le sens horaire
    public static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;
        int i = 0;

        // Etape 1 : transposer la matrice
        // On echange A[i][j] avec A[j][i]
        while (i < n) {
            int j = i + 1;

            while (j < n) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
                j++;
            }

            i++;
        }

        // Etape 2 : inverser chaque ligne
        i = 0;

        while (i < n) {
            int j = 0;

            while (j < n / 2) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
                j++;
            }

            i++;
        }
    }

    // Affiche la matrice ligne par ligne
    public static void afficher(int[][] A) {
        int i = 0;

        while (i < A.length) {
            int j = 0;

            while (j < A[i].length) {
                System.out.print(A[i][j] + " ");
                j++;
            }

            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // Lecture et verification de la taille
        int n;

        do {
            System.out.print("Donner N (entre 2 et 200) : ");
            n = clavier.nextInt();
        } while (n < 2 || n > 200);

        // Creation et lecture de la matrice
        int[][] A = new int[n][n];

        System.out.println("Donner les elements de la matrice :");

        int i = 0;

        while (i < n) {
            int j = 0;

            while (j < n) {
                A[i][j] = clavier.nextInt();
                j++;
            }

            i++;
        }

        // Rotation de la matrice
        rotate90ClockwiseInPlace(A);

        // Affichage de la matrice apres rotation
        System.out.println("Matrice apres rotation :");
        afficher(A);

        clavier.close();
    }
}


package Exercice5;


public class TestRotation {

    public static void main(String[] args) {

        // Creation d'une matrice de test
        int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matrice initiale :");
        RotationMatrice.afficher(A);

        // Rotation de 90 degres dans le sens horaire
        RotationMatrice.rotate90ClockwiseInPlace(A);

        System.out.println("\nMatrice apres rotation :");
        RotationMatrice.afficher(A);
    }
}


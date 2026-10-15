package Exercice4;

public class TestTableaux {

    public static void main(String[] args) {

        // Creation de deux tableaux de memes dimensions
        double[][] t1 = {
            {1.5, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        double[][] t2 = {
            {2.5, 1.0, 2.0},
            {1.0, 3.0, 4.0}
        };

        // Affichage du premier tableau
        System.out.println("Tableau t1 :");
        Tableaux.affiche(t1);

        // Verification de la regularite du tableau
        System.out.println("\nLe tableau t1 est-il regulier ? "
                + Tableaux.regulier(t1));

        // Calcul et affichage de la somme de chaque ligne
        System.out.println("\nSomme des lignes de t1 :");
        double[] sommes = Tableaux.sommeLignes(t1);

        int i = 0;
        while (i < sommes.length) {
            System.out.println("Ligne " + (i + 1) + " : " + sommes[i]);
            i++;
        }

        // Addition des deux tableaux
        System.out.println("\nSomme des deux tableaux :");
        double[][] resultat = Tableaux.somme(t1, t2);

        // Affichage du resultat si l'addition est possible
        if (resultat != null) {
            Tableaux.affiche(resultat);
        } else {
            System.out.println("Les tableaux ne peuvent pas etre additionnes.");
        }
    }
}


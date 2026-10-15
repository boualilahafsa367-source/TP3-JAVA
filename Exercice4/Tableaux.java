package Exercice4;


public class Tableaux {

    // Affiche les valeurs du tableau, une ligne à l'écran par ligne du tableau
    public static void affiche(double[][] t) {
        int i = 0;

        while (i < t.length) {
            int j = 0;

            while (j < t[i].length) {
                System.out.print(t[i][j] + " ");
                j++;
            }

            System.out.println();
            i++;
        }
    }

    // Vérifie si toutes les lignes ont la même taille
    public static boolean regulier(double[][] t) {
        if (t.length == 0) {
            return true;
        }

        int taille = t[0].length;
        int i = 1;

        while (i < t.length) {
            if (t[i].length != taille) {
                return false;
            }
            i++;
        }

        return true;
    }

    // Calcule la somme des valeurs de chaque ligne
    public static double[] sommeLignes(double[][] t) {
        double[] resultat = new double[t.length];
        int i = 0;

        while (i < t.length) {
            double somme = 0;
            int j = 0;

            while (j < t[i].length) {
                somme += t[i][j];
                j++;
            }

            resultat[i] = somme;
            i++;
        }

        return resultat;
    }

    // Additionne deux tableaux s'ils sont réguliers et de mêmes dimensions
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }

        if (t1.length != t2.length) {
            return null;
        }

        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }

        double[][] resultat = new double[t1.length][];
        int i = 0;

        while (i < t1.length) {
            resultat[i] = new double[t1[i].length];
            int j = 0;

            while (j < t1[i].length) {
                resultat[i][j] = t1[i][j] + t2[i][j];
                j++;
            }

            i++;
        }

        return resultat;
    }
}


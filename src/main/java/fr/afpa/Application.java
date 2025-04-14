package fr.afpa;

import java.awt.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * The type Application.
 */
public class Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        // -------------- Exercice 3.4------------------------------------------

        // enoughMoney();

        // -------------- Exercice 3.5------------------------------------------
        // lunchPrice();

        // -------------- Exercice 5.7------------------------------------------
        // manipTab();

        // -------------- Exercice 8------------------------------------------
        plusOuMoins();

    }


    /**
     * Is adult.
     *
     * @param birthYear the birth year
     * @return
     */
    public static String isAdult(int birthYear) {
        if (birthYear > 2007) {
            System.out.println("Vous êtes mineur");
        } else {
            System.out.println("Vous êtes majeur");
        }
        return "";
    }

    /**
     * Find max min.
     *
     * @param var1 the var 1
     * @param var2 the var 2
     * @param var3 the var 3
     */
    public static void findMaxMin(int var1, int var2, int var3) {
        // int min = var1;
        // int max = var1;
        //
        // if (var2 < min) {
        // min = var2;
        // }
        // if (var3 < min) {
        // min = var3;
        // }
        //
        // if (var2 > max) {
        // max = var2;
        // }
        // if (var3 > max) {
        // max = var3;
        // }
        //
        // System.out.println("Le maximum est : " + max + " et le minimum est : " +
        // min);

        int min = Integer.min(var1, var2);
        int max = Integer.max(var2, var3);
        System.out.println(min);
        System.out.println(max);

    }

    /**
     * Voyelle ou consonne.
     *
     * @param letter the letter
     */
    public static void voyelleOuConsonne(char letter) {
        // a, e, i, o, u, y

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            System.out.println("v");
        } else {
            System.out.println("c");

        }
    }

    /**
     * Enough money.
     */
    public static void enoughMoney() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre solde de compte: ");

        int soldeCompte = scanner.nextInt();
        if (soldeCompte < 0) {
            System.out.println("Vous ne pouvez pas être a découvert");
        } else {

            System.out.println("Entrez le prix de votre produit: ");

            int productPrice = scanner.nextInt();

            if (soldeCompte < productPrice) {
                System.out.println("Vous ne pouvez pas acheter le produit.");
            } else {
                System.out
                        .println("Vous pouvez acheter le produit et il vous restera: " + (soldeCompte - productPrice));
            }
        }
    }

    /**
     * Lunch price.
     */
    public static void lunchPrice() {
        boolean restartCal = true;

        while (restartCal) {
            int montParticipation = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Quel est votre état matrimonial ('C' pour celibataire, 'A' pour autre): ");
            String etatMatri = scanner.next();

            System.out.println("Nombre d'enfants à charge: ");
            int nbEnfant = scanner.nextInt();

            System.out.println("Quel est votre salaire mensuel: ");
            int salaireMens = scanner.nextInt();

            if (etatMatri == "C" || etatMatri == "c") {
                montParticipation = 20;

            } else {
                montParticipation = 25;

            }

            montParticipation += (15 * nbEnfant);

            if (salaireMens < 1800) {
                montParticipation += 10;
            }

            if (montParticipation > 50) {
                montParticipation = 50;

            }
            System.out.println("le taux de participation est de: " + montParticipation
                    + " Souhaitez-vous effectuer le calcul pour un autre employé ? (si oui 'O', si non 'N')");

            String reponseValid = scanner.next();

            if (reponseValid.equalsIgnoreCase("N")) {
                restartCal = false;
            }
        }

    }

    /**
     * Effectue la somme de 2 entiers
     *
     * @param a premier entier
     * @param b deuxième entier
     * @return résultat de la somme
     */

    public static int subYoutubeFor(int subscriber, int mois, double coeff) {

        for (int i = 1; i <= mois; i++) {
            subscriber += subscriber * coeff;
            System.out.println("vous avez " + subscriber + " sur le mois " + i);
        }
        System.out.println("dans " + mois + " mois vous aurez " + subscriber);
        return subscriber;
    }

    public static int subYoutubeWhile(int subscriber, int mois, double coeff) {
        int i = 1;
        while (i <= mois) {
            subscriber += subscriber * coeff;
            System.out.println("vous avez " + subscriber + " sur le mois " + i);
            i++;
        }
        System.out.println("dans " + mois + " mois vous aurez " + subscriber);
        return subscriber;

    }

    public static int sommeEntier(int n) {
        int entier = 0;

        for (int i = 0; i <= n; i++) {
            entier += i;
            System.out.println(entier);
        }

        return entier;
    }

    public static void fizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

    public static int calcFacto(int n) {
        int ndiff = 1;
        for (int i = 1; i <= n; i++) {
            ndiff *= i;
        }
        return ndiff;
    }

    public static void afficherTab() {
        double[] doubleArray = { 12.2, 11.3, 4.4, 2.0 };

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
    }

    public static int rechercheSeqFor(int value) {
        int findValue = 0;
        int[] intArray = { 5, 6, 3, 12, 25 };
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                findValue = intArray[i];
            }
        }
        return findValue;
    }

    public static int rechercheSeqWhile(int value) {
        int n = 0;
        int[] intArray = { 5, 6, 3, 12, 25 };
        while (intArray[n] != value) {
            n++;
        }
        return intArray[n];
    }

    public static int rechercheSeqDoWhile(int value) {
        int i = 0;
        int[] intArray = { 5, 6, 3, 12, 25 };

        do {
            i++;
        } while (intArray[i] != value);

        return intArray[i];
    }

    public static int sumBetween(int firstVal, int endVal) {
        int resultSum = 0;
        int[] sumInTab = { 5, 12, 6, 1, 7, 8, 3 };

        while (firstVal <= endVal) {
            resultSum += sumInTab[firstVal];
            firstVal++;
        }
        return resultSum;
    }

    public static int[] minMaxTab(int[] tabEntree) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tabEntree.length; i++) {
            if (tabEntree[i] < min) {
                min = tabEntree[i];
            }
            if (tabEntree[i] > max) {
                max = tabEntree[i];
            }
        }
        int[] tabMinMax = { min, max };
        return tabMinMax;
    }

    public static boolean swap(int firstVal, int secondVal) {
        boolean validation = false;
        int[] swapTab = { 4, 6, 2, 155 };

        if (firstVal <= swapTab.length && secondVal <= swapTab.length) {
            int swap1 = swapTab[firstVal];
            int swap2 = swapTab[secondVal];

            swapTab[firstVal] = swap2;
            swapTab[secondVal] = swap1;

            for (int i = 0; i < swapTab.length; i++) {
                System.out.println(swapTab[i]);
            }
            validation = true;
        }
        return validation;
    }

    public static double calcMoy(int[] tabEntree) {
        double moyenne = 0;

        for (int i = 0; i < tabEntree.length; i++) {
            moyenne += tabEntree[i];
        }
        moyenne = moyenne / tabEntree.length;

        return moyenne;
    }

    public static void manipTab() {
        int[] arrayTabSaisi;
        int moy = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez choisir un nombre de valeurs à saisir: \n");
        int nb = scanner.nextInt();
        arrayTabSaisi = new int[nb];

        for (int i = 0; i < arrayTabSaisi.length; i++) {
            System.out.println("Veuillez saisir le nombre " + (i + 1) + " :\n");

            // Met la valeur saisi dans le tableau
            arrayTabSaisi[i] = scanner.nextInt();

            // Sauvergarde des valeurs saisis pour calculer la moyenne
            moy += arrayTabSaisi[i];

            // compare les valeurs du tableau pour avoir le min et max
            if (arrayTabSaisi[i] < min) {
                min = arrayTabSaisi[i];
            }
            if (arrayTabSaisi[i] > max) {
                max = arrayTabSaisi[i];
            }
        }
        System.out.println("Tableau de nombres saisis : " + arrayTabSaisi +
                "\nMoyenne = " + (moy / arrayTabSaisi.length) +
                "\nMinimum = " + min +
                "\nMaximum = " + max);
    }

    public static int[] invert(int[] firstArray) {

        int[] newArray = new int[firstArray.length];
        int lenght = newArray.length - 1;

        for (int i = firstArray.length - 1; i >= 0; i--) {
            newArray[lenght - i] = firstArray[i];
        }
        return newArray;
    }

    public static int sum2DTab(int[][] array2D) {
        int result = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                result += array2D[i][j];

            }
        }
        return result;
    }

    public static int calcDiagonale(int[][] arrays2D, int diagonalType) {
        int result = 0;

        // TODO trouver une solution avec boucle WHILE pour ne pas avoir à créer "inverseResult"

        int i=0;
        while (i<arrays2D.length){
            if (diagonalType ==1){
                result += arrays2D[i][i];
            }else{
                result += arrays2D[arrays2D.length - 1 - i][i];
            }
            i++;
        }

        return result;

    }

    public static void drawTriangle(int niveau) {
        int i = 1;
        while (i <= niveau * 2) {
            String triangle = "*";
            if (i < niveau) {
                System.out.println(triangle.repeat(i));
            } else if (i >= niveau) {

                System.out.println(triangle.repeat(2 * niveau - i));
            }

            i++;
        }
    }

    public static void plusOuMoins() {
        boolean nbFind = false;
        Random r = new Random();
        int n = r.nextInt(100);
        int vie = 5;

        System.out.println("Devinez le nombre situé entre 1 et 100. Vous avez " + vie + " vie");

        while (vie > 0 && !nbFind) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ecrivez un nombre: ");
            int nbGuess = scanner.nextInt();

            if (nbGuess == n) {
                System.out.println("vous avez trouvé, le nombre est: " + n);
                nbFind = true;
            } else if (nbGuess > n) {
                vie--;
                System.out.println("le nombre à trouver est plus petit recommencer il vous reste " + vie + " vie.");
            } else {
                vie--;
                System.out.println("le nombre à trouver est plus grand recommencer il vous reste " + vie + " vie.");
            }

        }
    }

    public static int voyelle(String str) {
        str = str.toLowerCase();

        int compteur = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'y') {

                compteur++;

            }
        }

        System.out.println("Il y a " + compteur + " voyelles au total dans le mot: " + str);
        return compteur;
    }

    public static int countMaj(String str) {
        int compteur = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {

                compteur++;

            }
        }

        System.out.println("Il y a " + compteur + " Majuscule au total dans le String: " + str);
        return compteur;
    }

    public static String minToMaj(String str) {
        str = str.toUpperCase();

        return str;
    }

    public static String reverseString(String str) {
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;
    }

    public static String camelCase(String str){

        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).matches("\\W")){

                str = str.replaceFirst("\\W", "" + Character.toUpperCase(str.charAt(i + 1)));
                str = str.substring(0, i+1) + str.substring(i + 2);

            }

        }

        return str;
    }

    public static int[] findChar(String chaineRef, String motATrouver){

        int index2 = -1;
        int index1 = -1;
        if (chaineRef.indexOf(motATrouver) !=-1) {
            index2 = (chaineRef.indexOf(motATrouver));
            index1 = (chaineRef.indexOf(motATrouver)+(motATrouver.length()-1));
        }
        int[] resultIndex = new int[] {index1, index2};
        return resultIndex;
    }

    public static int binaireToBase(int n){
        int result=0;
        String tabToConvert = Integer.toString(n);
        for (int i = 0; i < tabToConvert.length(); i++) {
            if (Character.getNumericValue(tabToConvert.charAt(i)) == 1) {
                result += Math.pow(2, tabToConvert.length() - i -1);
            }else {
                result += Math.pow(0, tabToConvert.length() - i- 1);
            }
        }
        return result;
    }

    // TODO Revenir faire un jeux de test

    public static int baseToBinary (int n){
        int result =0;
        int produit =1;

        while (n>0){
            result += n % 2 * produit;
            produit = produit* 10;
            n /= 2;


        }


        return result;
    }
    public static int[] fuseTabCroiss (int []array1, int []array2){

        int [] tabConcat = new int [array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            tabConcat[i] = array1[i];
        }
            for (int j = 0; j < array2.length; j++) {
                tabConcat[array1.length+j] = array2[j];
            }
        Arrays.sort(tabConcat);
            return tabConcat;
    }

    public static boolean palindrome (String testPal){
        boolean result =false;
        String comparePal ="";

        for (int i = testPal.length()-1; i >= 0 ; i--) {
            comparePal = comparePal + testPal.charAt(i);
        }
        testPal = testPal.toLowerCase();
        comparePal = comparePal.toLowerCase();
        if (comparePal.equals(testPal)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}

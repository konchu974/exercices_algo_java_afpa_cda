package fr.afpa;

import javax.xml.transform.sax.SAXSource;
import java.awt.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * The type Application.
 */
public class Application {


    public static void main(String[] args) {

        // -------------- Exercice 3.4------------------------------------------

        // enoughMoney();

        // -------------- Exercice 3.5------------------------------------------
        // lunchPrice();

        // -------------- Exercice 5.7------------------------------------------
        // manipTab();

        // -------------- Exercice 8------------------------------------------
//        plusOuMoins();

        gameLogic(1234);

    }

    /**
     * verifie si une personne est majeur ou non avec son année de naissance
     *
     * @param birthYear l'anné de naissance
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
     * Trouver le min et le max entre trois variable
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
     * fonction qui cherche si le charactere est une Voyelle ou une consonne.
     *
     * @param letter verification de si c'est une voyelle ou une consonne
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
     * fonction de speculation d'abonnés
     *
     * @param subscriber nombres d'abonnés de base
     * @param mois       nombre de mois pour la speculation d'abonnés
     * @param coeff      multiplicateur d'abonnés au mois
     * @return résultat de la spéculation
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
        double[] doubleArray = {12.2, 11.3, 4.4, 2.0};

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
    }

    public static int rechercheSeqFor(int value) {
        int findValue = 0;
        int[] intArray = {5, 6, 3, 12, 25};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                findValue = intArray[i];
            }
        }
        return findValue;
    }

    public static int rechercheSeqWhile(int value) {
        int n = 0;
        int[] intArray = {5, 6, 3, 12, 25};
        while (intArray[n] != value) {
            n++;
        }
        return intArray[n];
    }

    public static int rechercheSeqDoWhile(int value) {
        int i = 0;
        int[] intArray = {5, 6, 3, 12, 25};

        do {
            i++;
        } while (intArray[i] != value);

        return intArray[i];
    }

    public static int sumBetween(int firstVal, int endVal) {
        int resultSum = 0;
        int[] sumInTab = {5, 12, 6, 1, 7, 8, 3};

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
        int[] tabMinMax = {min, max};
        return tabMinMax;
    }

    public static boolean swap(int firstVal, int secondVal) {
        boolean validation = false;
        int[] swapTab = {4, 6, 2, 155};

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

        int i = 0;
        while (i < arrays2D.length) {
            if (diagonalType == 1) {
                result += arrays2D[i][i];
            } else {
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

    // ✅ Checked!
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

    // ✅ Okay!
    public static String reverseString(String str) {
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;
    }

    public static String camelCase(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).matches("\\W")) {

                str = str.replaceFirst("\\W", "" + Character.toUpperCase(str.charAt(i + 1)));
                str = str.substring(0, i + 1) + str.substring(i + 2);
            }
        }
        return str;
    }

    /**
     * fonction pour trouver ou est la position du premier charactere d'un mot et le dernier dans une phrase
     *
     * @param chaineRef   chaine de charactere de reference
     * @param motATrouver mot que l'on doit chercher dans {@code chaineRef}
     * @return un tableau avec l'index du premier et du dernier charactere du mots a trouver
     */
    public static int[] findChar(String chaineRef, String motATrouver) {
        // TODO est-il trouver une solution uniquement basée sur des boucles sans se
        // servir de "indexOf"


        //Je me suis fait aider par mon ami l'I.A pour celui la...

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i <= chaineRef.length() - motATrouver.length(); i++) {
            int j = 0;

            //Pour la condition du while
            while (j < motATrouver.length() && chaineRef.charAt(i + j) == motATrouver.charAt(j)) {
                j++;
            }
            if (j == motATrouver.length()) {
                index1 = i;
                index2 = i + j - 1;
                break;
            }
        }

        return new int[]{index1, index2};
    }

    // ✅ Well done!
    public static int binaireToBase(int n) {
        int result = 0;
        String tabToConvert = Integer.toString(n);
        for (int i = 0; i < tabToConvert.length(); i++) {
            if (Character.getNumericValue(tabToConvert.charAt(i)) == 1) {
                result += Math.pow(2, tabToConvert.length() - i - 1);
            } else {
                result += Math.pow(0, tabToConvert.length() - i - 1);
            }
        }
        return result;
    }

    // TODO Revenir faire un jeux de test

    public static int baseToBinary(int n) {
        int result = 0;
        int produit = 1;

        while (n > 0) {
            result += n % 2 * produit;
            produit = produit * 10;
            n /= 2;

        }

        return result;
    }

    // TODO ajouter Javadoc

    /**
     * Fusionne deux tableaux triés en ordre croissant en un seul tableau trié en ordre croissant.
     *
     * @param array1 le premier tableau trié en ordre croissant
     * @param array2 le deuxième tableau trié en ordre croissant
     * @return un nouveau tableau contenant tous les éléments de {@code array1} et {@code array2}, triés en ordre croissant
     */
    public static int[] fuseTabCroiss(int[] array1, int[] array2) {

        int[] tabConcat = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                tabConcat[k] = array1[i++];
                k++;
            } else {
                tabConcat[k] = array2[j++];
                k++;
            }
        }

        while (i < array1.length) {
            tabConcat[k] = array1[i++];
            k++;
        }

        while (j < array2.length) {
            tabConcat[k] = array2[j++];
            k++;
        }


        // TODO serait-il possible d'imaginer une solution algorithmique uniquement
        // uniquement basée sur des boucles, des comparaisons et des indexes pour éviter
        // le "sort" ?

        return tabConcat;
    }

    // TODO ajouter commentaires Javadoc

    /**
     * Vérifie si le texte donné est un palindrome.
     * Un palindrome est un mot ou une phrase qui se lit de la même façon à l'endroit et à l'envers.
     *
     * @param testPal Le texte à analyser pour savoir s'il est un palindrome.
     * @return true si le texte est un palindrome, false sinon.
     */
    public static boolean palindrome(String testPal) {
        testPal = testPal.replaceAll("[^a-zA-ZÀ-ÿ0-9_]+", "");
        testPal = testPal.replaceAll("[éèêëÉÈÊË]", "e");
        testPal = testPal.replaceAll("[àâÀÂ]", "a");
        testPal = testPal.replaceAll("[îïÎÏ]", "i");
        testPal = testPal.replaceAll("[ôöÔÖ]", "o");
        testPal = testPal.replaceAll("[ûüÛÜ]", "u");
        testPal = testPal.replaceAll("[çÇ]", "c");
        testPal = testPal.replaceAll("[ÿŸ]", "y");

        // ✅ ok solution avec création d'une nouvelle string
        testPal = testPal.toLowerCase();
        int j = 0;
        int i = testPal.length() - 1;
        while (i > j) {
            if (testPal.charAt(i) != testPal.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }

        return true;


        // TODO pour aider à la création dynamique de String tu peux certes utiliser la
        // concaténation comme proposée
        // tu peux également construire des strings dynamique en utilisant
        // https://www.ionos.fr/digitalguide/sites-internet/developpement-web/stringbuilder-en-java/

        // TODO serait-il possible d'imaginer une solution basée uniquement sur
        // l'utilisation 2 indexes et de boucles
        // intérêt : ne pas avoir à recréer de String

    }

    // TODO ajouter commentaire en Javadoc pour détailler l'objectif de la fonction

    /**
     * algorithme permettant de verifier si un numero de carte bleu est valide
     *
     * @param numCarte numero de carte à entrer dans un tableau pour validation de celle-ci
     * @return true si la carte est valide
     */
    public static boolean luhnAlgo(int[] numCarte) {

        for (int i = numCarte.length - 1; i >= 0; i--) {
            if (numCarte.length % 2 == 1) {
                if (i % 2 == 1) {
                    numCarte[i] *= 2;

                    if (numCarte[i] > 9) {
                        numCarte[i] = 1 + (numCarte[i] - 10);
                    }

                    // TODO la ligne result += numCarte[i]; semble être faite dans tous les cas
                    // serait il possible de la sortir du if ?

                }
                numCarte[i] += numCarte[i];
            } else {
                if (i % 2 == 0) {
                    numCarte[i] *= 2;

                    if (numCarte[i] > 9) {
                        numCarte[i] = 1 + (numCarte[i] - 10);
                    }
                    // TODO même remarque que précedemment
                }
                numCarte[i] += numCarte[i];
            }
        }
        System.out.println(Arrays.stream(numCarte).sum());
        return Arrays.stream(numCarte).sum() % 10 == 0;
    }

    // TODO ajouter commentaire en "javadoc"

    /**
     * function permettant de repartir au mieux le nombre de pièces necessaire pour rendre la rendre la monnaie
     *
     * @param sommeARendre valeur pour laquel on va chercher le rendu de monnaie optimal
     * @return un tableau avec le nombre de pièces utilisées
     */
    public static int[] gloutAlgo(int sommeARendre) {

        int[] piece = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] nombrePieceRendu = new int[piece.length];

        // TODO tout paramètre est une variable qui répond aux même règles qu'une
        // variable locale
        // ainsi, il est possible d'utiliser l'opérateur d'affectation avec
        // "sommeARendre" et ainsi modifier sa valeur, par exemple :
        // sommeARendre = sommeARendre - piece[i]
        // (ou sommeARendre -= piece[i])
        //
        // sachant ceci, existerait-il une solution sans utiliser la variable result ?
        // autre conseil : éviter de mixer les langues pour les noms de variables
        for (int i = 0; i < piece.length; i++) {
            while (sommeARendre >= piece[i]) {
                nombrePieceRendu[i] += 1;
                sommeARendre -= piece[i];
            }
        }

        return nombrePieceRendu;
    }

    /**
     * @param tabEntier tableau de int à additionner
     * @param n         parametre qui évolue au fur et à mesure de la fonction
     * @return le resultat de la somme du tableau
     */
    public static int sommeRecursive(int[] tabEntier, int n) {
        // 🔥 Vive le récursif !
        if (n <= tabEntier.length - 1) {
            return tabEntier[n] + sommeRecursive(tabEntier, n + 1);
        } else {
            return 0;
        }

    }

    /**
     * @param str
     * @param n
     * @return
     */
    public static String insertSymbol(String str, int n) {
        if (n < str.length() - 1) {
            return str.charAt(n) + "-" + insertSymbol(str, n + 1);
        } else if (n < str.length()) {
            return str.charAt(n) + "";
        } else {
            return "";
        }
    }


    /**
     * ----------------------FIN DE CORRECTION DE LUDOVIC------------
     * Test unitaire dans ../test/java/fr.afpa/ApplicationTest.java
     **/


    public static int[] insertionSort(int[] tabToSort) {
        int memory = 0;
        for (int i = 0; i < tabToSort.length; i++) {
            int k = 0;
            memory = tabToSort[i];
            for (int j = i; j >= 0; j--) {
                if (memory < tabToSort[j]) {

                    tabToSort[i - k] = tabToSort[j];
                    tabToSort[j] = memory;
                    k++;


                }
            }
        }
        return tabToSort;
    }

    public static int[] bubbleSort(int[] tabToSort) {
        int memory = 0;
        for (int i = tabToSort.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (tabToSort[j] > tabToSort[j + 1]) {
                    memory = tabToSort[j];
                    tabToSort[j] = tabToSort[j + 1];
                    tabToSort[j + 1] = memory;
                }
            }
        }
        return tabToSort;
    }

    public static int[] combSort(int[] tabToSort) {
        int memory = 0;
        int gap = tabToSort.length;

        for (int i = 0; i < tabToSort.length; i++) {
            for (int j = 0; gap + j < tabToSort.length; j++) {
                if (tabToSort[j] > tabToSort[gap + j]) {
                    memory = tabToSort[gap + j];
                    tabToSort[gap + j] = tabToSort[j];
                    tabToSort[j] = memory;
                }

            }
            gap /= 1.3;
        }
        return tabToSort;
    }

    public static int dichotoSearch(int[] tabToSearch, int valueToFind) {
        tabToSearch = Application.bubbleSort(tabToSearch);

        int leftTab = 0;
        int rightTab = tabToSearch.length - 1;

        boolean find = false;

        while (leftTab <= rightTab) {
            int centerTab = (rightTab + leftTab) / 2;
            if (valueToFind == tabToSearch[centerTab]) {
                System.out.println(tabToSearch[centerTab]);
                find = true;
                return centerTab;

            } else if (tabToSearch[centerTab] > valueToFind) {
                rightTab = centerTab - 1;

            } else if (tabToSearch[centerTab] < valueToFind) {
                leftTab = centerTab + 1;

            }
        }
        return -1;
    }


    //    public static String ceasarCode(String str, int shiftValue, String shiftDirection) {
//        String alphabet = "abcefghijklmnopqrstuvwxyz";
//        String wordFind = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < alphabet.length(); j++) {
//                if (alphabet.charAt(j) == str.charAt(i)) {
//                    wordFind += alphabet.charAt(j + shiftValue);
//                }
//            }
//        }
//
//        return wordFind;
//    }
    public static void gameLogic(int valuToFind) {
        int[] tabToFind = intIntoTab(valuToFind);

        int nbTry = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("la combinaison caché est composé de " + tabToFind.length + " chiffres. Trouver la combinaisont, vous avez " + nbTry + " chances.");


        while (nbTry > 0) {
            System.out.print("Entrez votre proposition : ");
            int nbGuess = scanner.nextInt();
            int[] tabGuess = intIntoTab(nbGuess);


            int equal = 0;
            int contain = 0;

            for (int i = 0; i < tabToFind.length; i++) {
                if (tabGuess[i] == tabToFind[i]) {
                    equal++;
                }

                for (int j = 0; j < tabGuess.length; j++) {
                    if (tabGuess[j] == tabToFind[i] && tabGuess[i] != tabToFind[i]) {
                        contain++;
                    }
                }

            }

            if (!Arrays.equals(tabGuess, tabToFind)) {
                nbTry--;
                System.out.println("il y a " + equal + " chiffres au bon endroit et " + contain +
                        " chiffres qui sont bon mais au mauvaise endroit. \nIl vous restes " + nbTry + " chances.");
            } else {
                System.out.println("Bravo");
                return;
            }
        }


    }

    public static int[] intIntoTab(int valueToCOnvert) {
        String nombreStr = String.valueOf(valueToCOnvert);
        int[] tabConvert = new int[nombreStr.length()];

        for (int i = 0; i < nombreStr.length(); i++) {
            tabConvert[i] = Character.getNumericValue(nombreStr.charAt(i));
        }
        return tabConvert;

    }

}

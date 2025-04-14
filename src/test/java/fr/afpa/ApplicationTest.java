package fr.afpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void testIsAdultFunction() {

       Application.isAdult(2002);


    }

    @Test
    void testFindMaxMinFunction() {

        Application.findMaxMin(5, 15, 52);


    }

    @Test
    void testVoyelleOuConsonneFunction() {

        Application.voyelleOuConsonne('b');


    }

    @Test
    void testLunchPriceFunction() {
        Application.lunchPrice();
    }

    @Test
    void testSubYoutubeForFunction() {
        int resultFor = Application.subYoutubeFor(2500, 24, 0.05);
        assertEquals(8043, resultFor);

        int resultWhile = Application.subYoutubeWhile(2500, 24, 0.05);
        assertEquals( 8043, resultWhile);
    }

    @Test
    void testSommeEntierFunction(){
        int result = Application.sommeEntier(5);
        assertEquals(15, result);
    }

    @Test
    void testFizzBuzzFunction(){
        Application.fizzBuzz(15);
    }

    @Test
    void testCalcFactoFunction(){
        int result = Application.calcFacto(5);
        assertEquals(120, result);
    }

    @Test
    public void testAfficherTabFunction(){
        Application.afficherTab();

    }



/*-------------------exercice 5.2------------------*/
    @Test
    void testRechercheSeqForFunction(){
        int result = Application.rechercheSeqFor(12);
        assertEquals(12, result);
    }

    @Test
    void testRechercheSeqWhileFunction(){
        int result = Application.rechercheSeqWhile(3);
        assertEquals(3, result);
    }

    @Test
    void testRechercheSeqDoWhileFunction(){
        int result = Application.rechercheSeqDoWhile(25);
        assertEquals(25, result);
    }

    /*-------------------exercice 5.3------------------*/

    @Test
    void testSumBetweenFunction(){
        int result = Application.sumBetween(2,5);
        assertEquals(22, result);
    }

    /*-------------------exercice 5.3------------------*/

    @Test
    void testMinMaxTabFunction(){
        int[] result = Application.minMaxTab(new int[]{5, 25, 3, 1, 52});
        assertEquals(52, result[1]);
        assertEquals(1,result[0]);
    }

    /*-------------------exercice 5.4------------------*/

    @Test
    void testSwapFunction(){
        boolean result = Application.swap(1,3);
        assertEquals(true,result);
    }

    /*-------------------exercice 5.5------------------*/

    @Test
    void testCalcMoyFunction(){
        double result = Application.calcMoy(new int[]{15, 16, 13, 15, 14});
        assertEquals(14.6, result);
    }

    @Test
    void testInvertFunction(){
        int[] result =Application.invert(new int[]{5, 25, 3, 1, 52});
        assertArrayEquals(new int[]{52, 1, 3, 25, 5} , result);
    }

    @Test
    void testSum2DTabFunction(){
        int result = Application.sum2DTab(new int[][] {
                {4, 6, 5},
                {7, 11, 34},
                {28, 6, 2},
                {1, 2, 3},
                {4, 3, 10}
        });
        assertEquals(126, result);
    }

    @Test
    void testCalcDiagonaleFunction(){
        int result = Application.calcDiagonale(new int[][] {
                {4, 6, 5, 2},
                {7, 11, 34, 1},
                {28, 6, 2, 15},
                {1, 2, 3, 19}
        }, 0);

        assertEquals(43, result);
    }

    @Test
    void testvoyelleFunction (){
        int result = Application.voyelle("Bonjour");
        assertEquals(3, result);
    }

    @Test
    void testCountMajFunction (){
        int result = Application.countMaj("Hello World");
        assertEquals(2, result);
    }

    @Test
    void testMinToMajFunction (){
        String result = Application.minToMaj("Hello World");
        assertEquals("HELLO WORLD", result);
    }

    @Test
    void testReverseStringFunction (){
        String result = Application.reverseString("La programmation c'est sympa.");
        assertEquals(".apmys tse'c noitammargorp aL", result);
    }

    @Test
    void testCamelCaseFunction(){
        String result = Application.camelCase("hello world je suis steve");
        assertEquals("helloWorldJeSuisSteve", result);
    }

    @Test
    void testFindCharResultFunction(){
        int[] result1 = Application.findChar("Mon nom est Personne.", "Personne");
        assertArrayEquals(new int[] {19, 12}, result1);

        int[] result2 = Application.findChar("Il n'y a rien par ici", "pas");
        assertArrayEquals(new int[] {-1, -1}, result2);


    }




}

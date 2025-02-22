import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author APEZOUMON AFANOU Têtê Elom
 */
public final class TestTabAlgos {

    /**
     * Test de la méthode plusGrand.
     */
    @Test
    public void testPlusGrand() {
        final int var1 = 7;
        final int var2 = 596;
        final int var3 = 22;
        final int var4 = 10;
        final int var5 = -4;
        final int[] tab1 = {1, 5, 3, 7, 2};
        final int[] tab2 = {596};
        final int[] tab3 = {5, -2, 22, -3};
        final int[] tab4 = {10, 10, 10, 10};
        final int[] tab5 = {Integer.MIN_VALUE, -9, Integer.MAX_VALUE, -48, 0};
        final int[] tab6 = {};
        final int[] tab7 = {-5, -8, -70, -4};
        assertEquals(var1, TabAlgos.plusGrand(tab1));
        assertEquals(var2, TabAlgos.plusGrand(tab2));
        assertEquals(var3, TabAlgos.plusGrand(tab3));
        assertEquals(var4, TabAlgos.plusGrand(tab4));
        assertEquals(Integer.MAX_VALUE, TabAlgos.plusGrand(tab5));
        assertEquals(var5, TabAlgos.plusGrand(tab7));
        assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.plusGrand(tab6);
        });
        assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.plusGrand(null);
        });
    }

    /**
     * Test de la méthode moyenne.
     */
    @Test
    public void testMoyenne() {
        final double var1 = 3;
        final double var2 = -3;
        final double var3 = 0.6;
        final double var4 = 11;
        final int[] tab1 = {1, 2, 3, 4, 5};
        final int[] tab2 = {-1, -2, -3, -4, -5};
        final int[] tab3 = {1, -2, 3, -4, 5};
        final int[] tab4 = {11};
        final int[] tab6 = {};
        assertEquals(var1, TabAlgos.moyenne(tab1));
        assertEquals(var2, TabAlgos.moyenne(tab2));
        assertEquals(var3, TabAlgos.moyenne(tab3));
        assertEquals(var4, TabAlgos.moyenne(tab4));
        assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.plusGrand(tab6);
        });
        assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.plusGrand(null);
        });
    }

    /**
     * Test de la méthode egaux.
     */
    @Test
    public void testEgaux() {
        final int[] tab1 = {5, 6, 89};
        final int[] tab2 = {61, Integer.MIN_VALUE, 23, Integer.MAX_VALUE, 96};
        final int[] tab3 = {61, Integer.MIN_VALUE, 23, Integer.MAX_VALUE, 96};
        final int[] emptyTab = {};
        final int[] tab4 = {1, 2, 3};
        final int[] tab5 = {3, 2, 1};
        final int[] tab6 = {1, 2};
        assertTrue(TabAlgos.egaux(tab4, tab4));
        assertFalse(TabAlgos.egaux(tab4, tab5));
        assertFalse(TabAlgos.egaux(tab4, tab6));
        assertFalse(TabAlgos.egaux(tab4, tab1));
        assertTrue(TabAlgos.egaux(emptyTab, emptyTab));
        assertFalse(TabAlgos.egaux(emptyTab, tab1));
        assertTrue(TabAlgos.egaux(tab2, tab3));
        assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.egaux(null, tab1);
        });
    }

    /**
     * Test de la méthode similaires.
     */
    @Test
    public void testSimilaires() {
        final int[] tab1 = {5, 6, 89};
        final int[] tab2 = {66, Integer.MIN_VALUE, 50, Integer.MAX_VALUE, 5};
        final int[] tab3 = {5, Integer.MIN_VALUE, 66, Integer.MAX_VALUE, 50};
        final int[] emptyTab = {};
        final int[] tab4 = {1, 2, 3};
        final int[] tab5 = {3, 2, 1};
        final int[] tab6 = {1, 2};
        assertTrue(TabAlgos.similaires(tab4, tab4));
        assertTrue(TabAlgos.similaires(tab4, tab5));
        assertFalse(TabAlgos.similaires(tab4, tab6));
        assertFalse(TabAlgos.similaires(tab4, tab1));
        assertTrue(TabAlgos.similaires(emptyTab, emptyTab));
        assertFalse(TabAlgos.similaires(emptyTab, tab1));
        assertTrue(TabAlgos.similaires(tab2, tab3));
        assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.similaires(null, emptyTab);
        });
    }
}

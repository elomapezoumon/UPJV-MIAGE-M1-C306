/**
 * @author APEZOUMON AFANOU Têtê Elom
 */
public final class TabAlgos {

    /**
     * Empecher l'instantiation de la classe.
     */
    protected TabAlgos() {
        throw new UnsupportedOperationException("Instanciation Interdite");
    }

    /**
     * @param tab tableau à traiter.
     * @throw IllegalArgumentException si tab est null ou vide.
     * @return valeur la plus grande d'un tableau.
     */
    public static int plusGrand(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * @param tab tableau à traiter.
     * @throw IllegalArgumentException si tab est null ou vide.
     * @return moyenne des valeurs du tableau.
     **/
    public static double moyenne(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return (double) sum / tab.length;
    }

    /**
     * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     * @param tab1 premier tableau
     * @param tab2 deuxieme tableau
     * @return true si les 2 tableaux contiennent les mêmes éléments
     *         avec les mêmes nombres d'occurences
     *         (avec les elements dans le meme ordre).
     **/
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null) {
            throw new IllegalArgumentException("Un tableau est null");
        }
        if (tab1.length != tab2.length) {
            return false;
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     * @param tab1 premier tableau
     * @param tab2 deuxieme tableau
     * @return true si les 2 tableaux contiennent les mêmes éléments
     *         avec les mêmes nombres d'occurrence (pas forcément dans le meme
     *         ordre).
     **/
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null) {
            throw new IllegalArgumentException("Un tableau est null");
        }
        if (tab1.length != tab2.length) {
            return false;
        }
        int n = tab1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tab1[j] > tab1[j + 1]) {
                    int temp = tab1[j];
                    tab1[j] = tab1[j + 1];
                    tab1[j + 1] = temp;
                }
            }
        }
        n = tab2.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tab2[j] > tab2[j + 1]) {
                    int temp = tab2[j];
                    tab2[j] = tab2[j + 1];
                    tab2[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Objects;

/**
 * Classe Produit représentant un produit avec un prix et une référence.
 * @author APEZOUMON AFANOU Têtê Elom
 */
public class Produit {
    /**
     * La référence du produit.
     * La référence du produit n'est pas modifiable.
     */
    private final String reference;

    /**
     * Le prix du produit.
     */
    private double prix;

    /**
     * Constructeur permettant l'instantiation de la classe.
     * @param paramReference la référence du produit
     */
    public Produit(final String paramReference) {
        this.reference = paramReference;
    }

    /**
     * Retourne le prix d'un produit.
     * @return le prix
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * Modifie le prix.
     * @param paramPrix le prix du produit
     */
    public final void setPrix(final Double paramPrix) {
        this.prix = paramPrix;
    }

    /**
     * @return la reference si le prix est positif, null sinon
     */
    public final String getReference() {
        String resultat = this.reference;
        if (prix > 0) {
            return resultat;
        } else {
            return null;
        }
    }

    /**
     * Compare un objet passé en paramètre à un objet produit.
     * @param o un objet
     * @return true si les 2 objets ont la même référence, sinon false.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        return Objects.equals(this.reference, ((Produit) o).reference);
    }

    /**
     * @return un entier unique permettant d'identifier un objet Produit.
     */
    @Override
    public int hashCode() {
        final int hash = 3;
        int calcHash = hash + Objects.hashCode(this.reference);
        return calcHash;
    }
}

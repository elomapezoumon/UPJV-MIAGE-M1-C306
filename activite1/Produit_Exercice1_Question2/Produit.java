// Source code is decompiled from a .class file using FernFlower decompiler.
public class Produit {
   private final String reference;
   private double prix;
   double tva = 0.2;

   public Produit(String var1) {
      this.reference = var1;
   }

   public double getPrix() {
      return this.prix;
   }

   public final void setPrix(Double var1) {
      this.prix = var1;
   }

   public final String getReference() {
      String var1 = this.reference;
      return this.prix > 0.0 ? var1 : null;
   }

   public boolean equals(Object var1) {
      return this.reference == ((Produit)var1).reference;
   }
}

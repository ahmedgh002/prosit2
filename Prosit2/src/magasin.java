public class magasin {
    int identifiant;
    String adresse;
    final int capacite = 50;
    Produit [] tabproduit=new Produit[capacite];

    public magasin() {
    }
    public magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }
    public void ajouter(Produit produit) {
        for (int i = 0; i < capacite; i++) {
            if (tabproduit[i] == null) {
                tabproduit[i] = produit;
            }
        }

    }

    @Override
    public String toString() {
        return "magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                '}';
    }
    public void afficher() {
        System.out.println("Les Produits du magasin :");
        for (int i = 0; i < tabproduit.length; i++) {

                System.out.println("Marque :"+tabproduit[i].getMarque() + "libelle :" + tabproduit[i].getLibellé() + "date :"+tabproduit[i].dateexpiration+ "prix :"+tabproduit[i].getPrix() + "Identifiant :"+tabproduit[i].getIdentifiant());

        }
    }
}

public class Ordinateur {
    private String nom, marque, description;
    private Double prix;
    private int qteStock;
    private Catégorie catégorie;

    public Ordinateur(String nom, String marque, String description, Double prix, int qteStock, Catégorie catégorie) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.qteStock = qteStock;
        this.catégorie = catégorie;
    }

    public Double prixPerQte(int qte){
        return prix*qte;
    }
}

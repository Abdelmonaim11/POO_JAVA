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
     public Ordinateur(){

     }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public void setCatégorie(Catégorie catégorie) {
        this.catégorie = catégorie;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrix() {
        return prix;
    }

    public int getQteStock() {
        return qteStock;
    }

    public Catégorie getCatégorie() {
        return catégorie;
    }

    public Double prixPerQte(int qte){
        return prix*qte;
    }
}

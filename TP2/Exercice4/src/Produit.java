public class Produit {
    private Long id;
    private String nom, marque, description;
    private Double prix;
    private int qteStock;

    public void setId(Long id) {
        this.id = id;
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

    public Long getId() {
        return id;
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
}

public class Ordinateur {
    private String nom, marque, description;
    private Double prix;
    private int qteStock;
    private Catégorie catégorie;
    public Double prixPerQte(int qte){
        return prix*qte;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Catégorie {
    private String nom, description;
    private List<Ordinateur> ordinateurList;

    public Catégorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
        ordinateurList = new ArrayList<>();
    }

    public void ajouterOrdinateur(Ordinateur ordinateur){
         ordinateurList.forEach(ordinat -> {
             if(ordinat.equals(ordinateur))throw new RuntimeException("L'ordinateur deja exister!!!");
             else {
                 ordinateurList.add(ordinateur);
             }
         });
    }
    public void supprimerOrdinateur(Ordinateur ordinateur){
        ordinateurList.forEach(ordinat -> {
            if(!ordinat.equals(ordinateur))throw new RuntimeException("L'ordinateur a supprimer n'existe pas!!!");
            else {
                ordinateurList.remove(ordinat);
            }
        });
    }
    public List<Ordinateur> rechercherParPrix(Double prix){
        List<Ordinateur> ordinateurListByPrice = new ArrayList<>();
        ordinateurList.forEach(o -> {
            if(o.getPrix() == prix){
                ordinateurListByPrice.add(o);
            }
        });
        return ordinateurListByPrice;
    }

    public Catégorie(String nom, String description, List<Ordinateur> ordinateurList) {
        this.nom = nom;
        this.description = description;
        this.ordinateurList = ordinateurList;
    }

    public Catégorie() {
    }

    @Override
    public String toString() {
        return "Catégorie{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", ordinateurList=" + ordinateurList +
                '}';
    }
}

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String  nom, prénom, adresse, email, ville, téléphone;
    private List<Commande> commandeList;
    public Client(String nom, String prénom, String adresse, String email, String ville, String téléphone) {
        this.nom = nom;
        this.prénom = prénom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.téléphone = téléphone;
        commandeList = new ArrayList<>();
    }
    public Client(){

    }
    public void ajouterCommande(Commande commande){
        for (Commande c : commandeList) {
            if (c.equals(commande))throw new RuntimeException("La commande deja exister!!!");
            else {
                commandeList.add(commande);
            }
        }
    }
    public void supprimerCommande(Commande commande){
        for (Commande c : commandeList) {
            if (!c.equals(commande))throw new RuntimeException("La commande n'existe pas!!!");
            else {
                commandeList.remove(c);
            }
        }
    }



    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", ville='" + ville + '\'' +
                ", téléphone='" + téléphone + '\'' +
                ", commandeList=" + commandeList +
                '}';
    }
}

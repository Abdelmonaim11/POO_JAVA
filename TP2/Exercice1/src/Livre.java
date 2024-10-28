public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;
    public void afficher(){
        System.out.println("ISBN de livre est: "+ISBN+"\nLe titre: "+titre+"\n"+auteur.afficher());
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}

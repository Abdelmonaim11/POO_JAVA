public class Auteur extends Personne{
    private String numAuteur;
    public Auteur(String numAuteur, String nom, String prenom, String email, String tel, int age) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }
    @Override
    public String afficher(){
         return "NumAuteur: "+this.numAuteur+"\n"+super.afficher();
    }
}

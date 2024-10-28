public class Personne {
    private String nom, prenom, email, tel;
    private int age;

    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String afficher(){
        return "Nom: "+this.nom+"\nPrenom: "+this.prenom+"\nEmail: "+this.email+"\nTelephone: "+this.tel+"\nAge: "+age;
    }


}

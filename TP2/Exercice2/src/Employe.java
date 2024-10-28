abstract class Employe {
    private String nom, prenom, email, telephone;
    private Double salaire;

    public Employe(String nom, String prenom, String email, String telephone, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public Employe() {
    }
    abstract Double calculerSalire();

    public Double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

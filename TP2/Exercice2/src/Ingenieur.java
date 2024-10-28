public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, Double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    Double calculerSalire() {
        return super.getSalaire()+(super.getSalaire()*0.15);
    }

    @Override
    public String toString() {
        return super.toString()+"Ingenieur{" +
                "specialite='" + specialite + '\'' +
                '}';
    }
}

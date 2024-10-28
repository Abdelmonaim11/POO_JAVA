public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, Double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    Double calculerSalire() {
        return super.getSalaire()+(super.getSalaire()*0.2);
    }

    @Override
    public String toString() {
        return super.toString()+"Manager{" +
                "service='" + service + '\'' +
                '}';
    }
}

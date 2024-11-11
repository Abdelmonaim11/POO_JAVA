package streams.Exercise2;

public class Employe {
    private String nom, departement;
    private Double salary;

    public Employe(String nom, String departement, Double salary) {
        this.nom = nom;
        this.departement = departement;
        this.salary = salary;
    }

    public Employe() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

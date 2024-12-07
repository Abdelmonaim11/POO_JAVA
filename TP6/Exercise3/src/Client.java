import java.io.Serializable;

public class Client implements Serializable {
    private String nom, prénom, adresse, tel, email;

    public Client(String nom, String prénom, String adresse, String tel, String email) {
        this.nom = nom;
        this.prénom = prénom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
    }

    public Client() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

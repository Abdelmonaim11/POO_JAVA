import java.util.Date;

public class Commande {
    private String ref;
    private Client client;
    private Date commandDate;
    private boolean etat;

    public Commande(String ref, Client client, Date commandDate, boolean etat) {
        this.ref = ref;
        this.client = client;
        this.commandDate = commandDate;
        this.etat = etat;
    }

    public Commande() {
    }

    @Override
    public String toString() {
        return "Commande{" +
                "ref='" + ref + '\'' +
                ", client=" + client +
                ", commandDate=" + commandDate +
                ", etat=" + etat +
                '}';
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCommandDate(Date commandDate) {
        this.commandDate = commandDate;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getRef() {
        return ref;
    }

    public Client getClient() {
        return client;
    }

    public Date getCommandDate() {
        return commandDate;
    }

    public boolean isEtat() {
        return etat;
    }
}

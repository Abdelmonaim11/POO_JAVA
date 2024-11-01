public class LigneCommande {
    private int qte;
    private Commande commande;
    private Ordinateur ordinateur;

    public LigneCommande(int qte, Commande commande, Ordinateur ordinateur) {
        this.qte = qte;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "qte=" + qte +
                ", commande=" + commande +
                ", ordinateur=" + ordinateur +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Mohamed", "Ali", "mohamed-ali1@gmail.com", "+212612131415", 60, "XYZ123456");
        Auteur auteur = new Auteur("QJY120986", "Hugo", "Vector", "hugo.vector@gmail.com", "+33123063249", 71);
        Livre livre = new Livre();
        livre.setAuteur(auteur);
        livre.setISBN(991726);
        livre.setTitre("Les Misérables");
        System.out.println("---------------Affichage de l'Adherent--------------");
        System.out.println(adherent.afficher());
        System.out.println("---------------Affichage de Livre et ces informations--------------");
        livre.afficher();
    }
}
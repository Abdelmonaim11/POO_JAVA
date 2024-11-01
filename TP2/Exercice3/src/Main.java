import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Declare and instantiate a category
        Catégorie catégorie = new Catégorie("Dell Technologies", "Dell Technologies Inc. designs, develops, manufactures, markets, sells, and supports various comprehensive and integrated solutions, products, and services in the Americas, Europe, the Middle East, Asia, and internationally.");
        //Declare and instantiate a list of three computers
        List<Ordinateur> ordinateurList = new ArrayList<>();
        ordinateurList.add(new Ordinateur("DELL latitude", "DELL", "Dell Latitude is a line of laptop computers manufactured and sold by American company Dell Technologies. It is a business-oriented line.", 4000.00,11, catégorie));
        ordinateurList.add(new Ordinateur("XPS 15 Laptop", "DELL", "Up to NVIDIA® GeForce RTX™ 4050 or Intel® Arc™ Graphics A370M", 7500.00,9, catégorie));
        ordinateurList.add(new Ordinateur("Latitude 5550 Laptop", "DELL", "Windows 11 Home, Windows 11 Pro, or Ubuntu® Linux®\n" +
                "Graphics\n" +
                "Up to Intel® Integrated Graphics", 8000.00,5, catégorie));
        catégorie.ajouterOrdinateur(ordinateurList.get(0));
        catégorie.ajouterOrdinateur(ordinateurList.get(1));
        catégorie.ajouterOrdinateur(ordinateurList.get(2));
        //Declare and instantiate a client
        Client client = new Client("Ali", "Mohamed", "mohammedia riad salam", "ali01@gmail.com", "Mohammedia", "0632135498");
        //— declare and instantiate a customer order;
        Commande commande = new Commande("ICV121", client, new Date(),false);
        client.ajouterCommande(commande);

        //— declare and instantiate a list of three command lines for the commande and the computers created;
        LigneCommande ligneCommande1 = new LigneCommande(2, commande, ordinateurList.get(0));
        LigneCommande ligneCommande2 = new LigneCommande(5, commande, ordinateurList.get(1));
        LigneCommande ligneCommande3 = new LigneCommande(7, commande, ordinateurList.get(2));
        System.out.println(commande);
        System.out.println(ligneCommande1);
        System.out.println(ligneCommande2);
        System.out.println(ligneCommande3);
        System.out.println(client.toString());
    }
}
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {

//        try {
//            // Instance de la classe GestionProduits
//            MetierProduitImpl metierProduit = new MetierProduitImpl();
//            metierProduit.add(new Produit("Produit1", "MarqueA", "DescriptionA", 100.0, 10));
//            metierProduit.add(new Produit("Produit2", "MarqueB", "DescriptionB", 200.0, 20));
//            metierProduit.saveAll();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        MetierProduitImpl metierProduit = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son nom");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par nom");
            System.out.println("5. Sauvegarder les produits");
            System.out.println("6. Quitter le programme");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne restante

            switch (choix) {
                case 1:
                    afficherProduits(metierProduit);
                    break;

                case 2:
                    rechercherProduit(metierProduit, scanner);
                    break;

                case 3:
                    addProduit(metierProduit, scanner);
                    break;

                case 4:
                    supprimerProduit(metierProduit, scanner);
                    break;

                case 5:
                    sauvegarderProduits(metierProduit);
                    break;

                case 6:
                    System.out.println("Au revoir !");
                    running = false;
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        scanner.close();
    }
    private static void afficherProduits(MetierProduitImpl metierProduit) {
        var produits = metierProduit.getAll();
        if (produits.isEmpty()) {
            System.out.println("Aucun produit n'est disponible.");
        } else {
            System.out.println("Liste des produits:");
            produits.forEach(System.out::println);
        }
    }

    private static void rechercherProduit(MetierProduitImpl metierProduit, Scanner scanner) {
        System.out.print("Entrez le nom du produit à rechercher: ");
        String nom = scanner.nextLine();
        var produit = metierProduit.findByName(nom);
        if (produit != null) {
            System.out.println("Produit trouvé: " + produit);
        } else {
            System.out.println("Aucun produit trouvé avec ce nom.");
        }
    }
    private static void addProduit(MetierProduitImpl metierProduit, Scanner scanner) {
        System.out.print("Entrez le nom du produit: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez la marque du produit: ");
        String marque = scanner.nextLine();
        System.out.print("Entrez la description du produit: ");
        String description = scanner.nextLine();
        System.out.print("Entrez le prix du produit: ");
        double prix = scanner.nextDouble();
        System.out.print("Entrez la quantité en stock: ");
        int qteStock = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne restante

        Produit produit = new Produit(nom, marque, description, prix, qteStock);
        metierProduit.add(produit);
        System.out.println("Produit ajouté avec succès.");
    }
    private static void supprimerProduit(MetierProduitImpl metierProduit, Scanner scanner) {
        System.out.print("Entrez le nom du produit à supprimer: ");
        String nom = scanner.nextLine();
        metierProduit.delete(nom);
        System.out.println("Produit(s) supprimé(s) avec succès.");
    }
    private static void sauvegarderProduits(MetierProduitImpl metierProduit) {
        try {
            metierProduit.saveAll();
            System.out.println("Produits sauvegardés avec succès.");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde des produits: " + e.getMessage());
        }
    }
}

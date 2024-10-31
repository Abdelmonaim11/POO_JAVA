import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 - Afficher la liste des produits.");
            System.out.println("2 - Rechercher des produits par mot clé.");
            System.out.println("3 - Ajouter un nouveau produit dans la liste.");
            System.out.println("4 - Récupérer et afficher un produit par ID.");
            System.out.println("5 - Supprimer un produit par ID.");
            System.out.println("6 - Quitter ce programme.");
            System.out.print("Saisie votre choix : ");
            choice = Integer.parseInt(scanner.next());
            switch (choice){
                case 1:
                    List<Produit> produitList = metierProduit.getAll();
                    produitList.forEach(produit -> {
                        System.out.println(produit.getId());
                        System.out.println(produit.getNom());
                        System.out.println(produit.getMarque());
                        System.out.println(produit.getDescription());
                        System.out.println(produit.getPrix());
                        System.out.println(produit.getQteStock());
                        System.out.println("--------------------");
                    });
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Saisie le mot cle: ");
                    String motCle = scanner.nextLine();
                    List<Produit> produitListByNames = metierProduit.findByNom(motCle);
                    produitListByNames.forEach(produit -> {
                        System.out.println("Les produit ayant "+motCle+" dans leur nom sont: ");
                        System.out.println(produit.getId());
                        System.out.println(produit.getNom());
                        System.out.println(produit.getMarque());
                        System.out.println(produit.getDescription());
                        System.out.println(produit.getPrix());
                        System.out.println(produit.getQteStock());
                        System.out.println("--------------------");
                    });
                    break;
                case 3:
                    Produit produit = new Produit();
                    scanner.nextLine();
                    System.out.println("Saisie l'ID de nouveau produit : ");
                    produit.setId(Long.parseLong(scanner.nextLine()));
                    System.out.println("Saisie le nom de nouveau produit : ");
                    produit.setNom(scanner.nextLine());
                    System.out.println("Saisie la marque de nouveau produit : ");
                    produit.setMarque(scanner.nextLine());
                    System.out.println("Saisie la description de nouveau produit : ");
                    produit.setDescription(scanner.nextLine());
                    System.out.println("Saisie le prix de nouveau produit : ");
                    produit.setPrix(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Saisie la Qte en stock de nouveau produit : ");
                    produit.setQteStock(Integer.parseInt(scanner.nextLine()));
                    metierProduit.add(produit);
                    break;
                case 4:
                    System.out.print("Entrer ID de produit a rechercher: ");
                    Long id = Long.parseLong(scanner.next());
                    Produit produitById =   metierProduit.findById(id);
                    if (produitById != null){
                        System.out.println("Le produit dans lequel ID="+id+" est:");
                        System.out.println(produitById.getId());
                        System.out.println(produitById.getNom());
                        System.out.println(produitById.getMarque());
                        System.out.println(produitById.getDescription());
                        System.out.println(produitById.getPrix());
                        System.out.println(produitById.getQteStock());
                    }
                    else {
                        System.out.println("Le produit n'existe pas!!!");
                    }
                    break;
                case 5:
                    System.out.print("Entrer ID de produit a supprimer: ");
                    Long idProduitDelete = Long.parseLong(scanner.next());
                    metierProduit.delete(idProduitDelete);
                    break;
            }
        }while (choice != 6);
    }
}

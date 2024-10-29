import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 - Afficher la liste des produits.");
            System.out.println("2 - Rechercher des produits par mot clé.");
            System.out.println("3 - Ajouter un nouveau produit dans la liste.");
            System.out.println("4 - Récupérer et afficher un produit par ID.");
            System.out.println("5 - Supprimer un produit par id.");
            System.out.println("6 - Quitter ce programme.");
            System.out.print("Saisie votre choix : ");
            choice = Integer.parseInt(scanner.next());
        }while (choice != 6);
    }
    }
}
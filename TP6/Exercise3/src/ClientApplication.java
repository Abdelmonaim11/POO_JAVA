import java.io.IOException;
import java.util.Scanner;

public class ClientApplication {
    public static void main(String[] args) throws IOException {
        MetierClientImpl metierClient = new MetierClientImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des clients");
            System.out.println("2. Rechercher un client par son nom");
            System.out.println("3. Ajouter un nouveau client");
            System.out.println("4. Supprimer un client par nom");
            System.out.println("5. Sauvegarder les clients");
            System.out.println("6. Quitter le programme");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne restante

            switch (choix) {
                case 1:
                    afficherClients(metierClient);
                    break;

                case 2:
                    rechercherClient(metierClient, scanner);
                    break;

                case 3:
                    addClient(metierClient, scanner);
                    metierClient.saveAll(); // Sauvegarder les clients après l'ajout
                    break;

                case 4:
                    supprimerClient(metierClient, scanner);
                    break;

                case 5:
                    sauvegarderClients(metierClient);
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

    private static void afficherClients(MetierClientImpl metierClient) {
        var clients = metierClient.getAll();
        if (clients.isEmpty()) {
            System.out.println("Aucun client n'est disponible.");
        } else {
            System.out.println("Liste des clients:");
            clients.forEach(System.out::println);
        }
    }

    private static void rechercherClient(MetierClientImpl metierClient, Scanner scanner) {
        System.out.print("Entrez le nom du client à rechercher: ");
        String nom = scanner.nextLine();
        var client = metierClient.findByName(nom);
        if (client != null) {
            System.out.println("Client trouvé: " + client);
        } else {
            System.out.println("Aucun client trouvé avec ce nom.");
        }
    }

    private static void addClient(MetierClientImpl metierClient, Scanner scanner) {
        System.out.print("Entrez le nom du client: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom du client: ");
        String prénom = scanner.nextLine();
        System.out.print("Entrez l'adresse du client: ");
        String adresse = scanner.nextLine();
        System.out.print("Entrez le téléphone du client: ");
        String tel = scanner.nextLine();
        System.out.print("Entrez l'email du client: ");
        String email = scanner.nextLine();

        Client client = new Client(nom, prénom, adresse, tel, email);
        metierClient.add(client);
        System.out.println("Client ajouté avec succès.");
    }

    private static void supprimerClient(MetierClientImpl metierClient, Scanner scanner) {
        System.out.print("Entrez le nom du client à supprimer: ");
        String nom = scanner.nextLine();
        metierClient.delete(nom);
        System.out.println("Client(s) supprimé(s) avec succès.");
    }

    private static void sauvegarderClients(MetierClientImpl metierClient) {
        try {
            metierClient.saveAll();
            System.out.println("Clients sauvegardés avec succès.");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde des clients: " + e.getMessage());
        }
    }
}

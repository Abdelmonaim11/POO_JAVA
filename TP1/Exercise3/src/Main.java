import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int choice ;
        Menu menu = new Menu(-1);
     do {
         System.out.println("1 - Saisir");
         System.out.println("2 - Afficher");
         System.out.println("3 - Inverser");
         System.out.println("4 - Nombre de mots");
         System.out.println("0 - Quitter");
         System.out.print("Saisie votre choix : ");
         choice = scanner.nextInt();
         scanner.nextLine();
         if (choice >= 1 && choice <= 4) {
             menu.choice = choice;
             menu.menu();
         } else if (choice != 0) {
             System.out.println("Choix non valide. Veuillez réessayer.");
         }
     }while (choice != 0);
    }
}
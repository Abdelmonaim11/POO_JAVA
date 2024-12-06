import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DossierContactMain {
    public static void main(String[] args) throws IOException, InterruptedException {
//        List<String> names = Arrays.asList("Monaim", "Amine", "Mouad", "Ayoub");
//        List<String> phoneNumbers = Arrays.asList("0623049332", "0634234312", "06342341223", "06234324234");
        DossierContact dossierContact = new DossierContact();
//        dossierContact.setNamesList(names);
//        dossierContact.setPhoneNumbersList(phoneNumbers);
//        dossierContact.addContact();
        //dossierContact.deleteContact("Monaim");
      //  dossierContact.searchContact("Amine");
//        dossierContact.updatePhoneNumber("Mouad", "07342342212");

        Scanner scanner = new Scanner(System.in);

        int choix = -1;
        while(choix!=5){
            System.out.println("1. Rechercher un numéro de téléphone.\n" +
                    "2. Ajouter un nouveau contact.\n" +
                    "3. Supprimer un contact.\n" +
                    "4. Changer le numéro de téléphone d’un contact.\n" +
                    "5. Quitter ce programme.");
            System.out.print("Tapez un choix: ");
            choix = Integer.parseInt(scanner.nextLine());
            if (choix==1){
                System.out.print("Entrer le nom du contact: ");
                String contactName = scanner.nextLine();
                dossierContact.searchContact(contactName);
            } else if (choix==2) {
                System.out.print("Saisie le nom du contact: ");
                String name = scanner.nextLine();
                System.out.print("Saisie le numero du telephone: ");
                String phonenumber = scanner.nextLine();
                dossierContact.addContact(name, phonenumber);
            } else if (choix == 3) {
                System.out.print("Saisie le nom du contact a supprimer: ");
                String name = scanner.nextLine();
                dossierContact.deleteContact(name);
            } else if (choix == 4) {
                System.out.println("Saisie les informtions du contact a changer");
                System.out.print("Saisie le nom du contact a changer: ");
                String name = scanner.nextLine();
                System.out.print("Saisie le nouveau numero du telephone: ");
                String newphoneNumber = scanner.nextLine();
                dossierContact.updatePhoneNumber(name, newphoneNumber);
            }else {
                System.out.println("Votre Choix est invalide!!!!");
            }
        }
    }
}

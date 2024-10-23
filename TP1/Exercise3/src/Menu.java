import java.util.Scanner;

public class Menu {
    public int choice;
    public StringBuilder chaine;
    public Menu(int choice){
        this.choice = choice;
        chaine = new StringBuilder();
    }
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        switch (choice){
            case 1:
                System.out.print("Entrer la chaine : ");
                chaine.append(scanner.nextLine());
                break;
            case 2:
                if (chaine.length() != 0)
                System.out.println(chaine);
                else
                    System.out.println("La chaine est vide! Saisie une chaine d'abord...");
                break;
            case 3:
                if (chaine.length() != 0)
                    System.out.println(chaine.reverse());
                else
                    System.out.println("La chaîne est vide !!!");
                break;
            case 4:
                String str = chaine.toString();
                String[] strTab = str.split(" ");
                System.out.println("Le nombre de mots de la chaîne est : "+strTab.length);
                break;
            case 0:
                chaine.setLength(0);
        }
        System.out.println("Frappez une touche pour revenir au menu...");
        scanner.nextLine();
    }
}


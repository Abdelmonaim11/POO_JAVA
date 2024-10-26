import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisie une chaine : ");
        String chaine = scanner.nextLine();
        OccurrenceCounter occurrenceCounter = new OccurrenceCounter(chaine);
        occurrenceCounter.findOccurence();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisie un verbe de premier group a conjuger : ");
        String verbe = scanner.nextLine();
        Conjugaison conjugaison = new Conjugaison(verbe);
        conjugaison.conjuger();
    }
}
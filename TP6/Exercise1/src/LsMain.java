import java.io.File;
import java.util.Scanner;

public class LsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le chemin complet du répertoire: ");
        String dir = scanner.nextLine();
        File file = new File(dir);
        if(file.exists() && file.isDirectory()){
            Ls ls = new Ls();
            ls.inputsOutputsList(file);
        }else {
            System.out.println("Votre répertoire n'existe pas!!!!");
        }
    }
}

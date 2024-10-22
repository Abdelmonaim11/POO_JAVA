import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le nombre des etudiants : ");
        int nbrEtd = Integer.parseInt(scanner.next());
        StudentsNotes studentsNotes = new StudentsNotes(nbrEtd);

        System.out.println("Saisie les notes des etudiants : ");
        for (int i=0; i<nbrEtd; i++){
            System.out.println("Saisie la note d'etudiant(e)- "+(i+1)+": ");
            studentsNotes.notes[i] = Float.parseFloat(scanner.next());
        }
        studentsNotes.trierAfficherNote();
        System.out.println("La note Moyenne de la classe est : "+studentsNotes.noteMoyenne());
        System.out.println("----La note Maximale et Minimale----");
        studentsNotes.minAndMaxRating();
        System.out.println("Saisie une note : ");
        float note = Float.parseFloat(scanner.next());
        System.out.println("Le nombre des etudiants ayant la note "+note+" est : "+studentsNotes.displayStudentCountByGrade(note));

    }
}
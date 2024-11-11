package collection.Exercise3;

import java.util.HashSet;
import java.util.stream.Stream;

public class Groups {
    public static void main(String[] args) {
        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();
//        Ajouter des noms des étudiants à chaque HashSet.
        Stream<String> streamA = Stream.of("Monaim", "Amine", "Ayoub", "Mouad", "Khalid", "Aness");
        streamA.forEach(groupA::add);
        Stream<String> streamB = Stream.of("Monaim", "Mohammed", "Ali", "Mouad", "Ahmed", "Adil");
        streamB.forEach(groupB::add);
        HashSet<String> intersectionAandB = new HashSet<>(groupA);
        intersectionAandB.retainAll(groupB);
        System.out.println("Le group A : "+groupA);
        System.out.println("Le group B : "+groupB);
        System.out.println("L'intersection de group A et B : "+intersectionAandB);
        HashSet<String> unionAandB = new HashSet<>(groupA);
        unionAandB.addAll(groupB);
        System.out.println("L'union de group A et B : "+unionAandB);
    }
}

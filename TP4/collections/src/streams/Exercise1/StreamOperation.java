package streams.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamOperation {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Stream<String> streamWord = Stream.of("class", "interface", "extends", "implements", "public", "private", "protected", "static", "final", "abstract", "super", "this", "void", "return", "try", "catch", "finally", "throw", "throws", "synchronized", "volatile", "transient", "instanceof", "int", "long", "float", "double", "char", "boolean", "String", "Array", "List", "Set", "Map", "Object", "Héritage", "Polymorphisme", "Encapsulation", "Abstraction", "Interfaces et classes abstraites", "Collections Framework", "Threading et Concurrence", "Streams API", "Lambda Expressions", "Exception Handling", "JVM", "JRE", "JDK", "Garbage Collection", "Serialization");
        streamWord.forEach(words::add);
        //Filtrer les mots qui contiennent la lettre "a".
        List<String> wordContainsA = words.stream().filter(s-> s.contains("a")).collect(Collectors.toList());
        System.out.println("Filtrer les mots qui contiennent la lettre \"a\".");
        System.out.println(wordContainsA);
        //Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son
        //inverse.
        List<String> wordsInvers = words.stream()
                .filter(s->s.length()>3)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("La list des mots inversees");
        System.out.println(wordsInvers);
        List<String> wordsContainsE = words.stream()
                .filter(s -> s.contains("e"))
                .collect(Collectors.toList());
        System.out.println(wordsContainsE);
        //Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de
        //ses caractères.
        List<List<Character>> wordsContainsEcharacters = wordsContainsE.stream()
                .map(w->{
                    List<Character> characterList = new ArrayList<>();
                    for (char c : w.toCharArray()) {
                        characterList.add(c);
                    } return characterList;
                }).collect(Collectors.toList());
        System.out.println(wordsContainsEcharacters);
        //Transformer chaque chaîne en sa version en majuscules.
        List<String> wordsInUpperCase = words.stream()
                .map(w->w.toUpperCase()).collect(Collectors.toList());
        System.out.println(wordsInUpperCase);
        //Convertir chaque chaîne en sa longueur.
        System.out.println("Convertir chaque chaîne en sa longueur.");
        List<Integer> wordsLength = words.stream()
                .map(w-> w.length()).collect(Collectors.toList());
        System.out.println(wordsLength);
        //Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en
        //une seule liste de caractères.
        List<Character> allwordsCharacters = words.stream()
                .flatMap(s->s.chars().mapToObj(c->(char)c)).collect(Collectors.toList());
        System.out.println(allwordsCharacters);
        //À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme "Nom -
        //Index" où l'index représente la position du nom dans la liste.
        List<String> wordsWithIndex = words.stream()
                .map(w-> w+"-"+words.indexOf(w)).collect(Collectors.toList());
        System.out.println(wordsWithIndex);
    }
}

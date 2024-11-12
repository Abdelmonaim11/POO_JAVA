package streams.Exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainEmploye {
    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        employes.add(new Employe("Monaim", "IT", 23000.00));
        employes.add(new Employe("Amine", "IT", 20000.00));
        employes.add(new Employe("Mouad", "Finance", 9600.00));
        employes.add(new Employe("Ayoub", "Management", 8700.00));
        employes.add(new Employe("Hamza", "Business", 7899.00));
        employes.add(new Employe("Khalid", "Communication", 6500.00));
        employes.add(new Employe("Mohammed", "IT", 12500.00));
        //Utiliser mapToDouble et sum pour calculer la somme totale des salaires de tous les
        //employés.
        Double totalSalary = employes.stream()
                .mapToDouble(p-> p.getSalary()).sum();
        System.out.println("la somme totale des salaires de tous les employés est : "+totalSalary);
        //Utiliser sorted pour trier la liste des employés par ordre alphabétique du nom.
        List<Employe> employesTrier = employes.stream()
                .sorted(Comparator.comparing(Employe::getNom)).collect(Collectors.toList());
        employesTrier.forEach(employe -> System.out.println(employe.getNom()));
        //Utiliser min pour trouver l'employé avec le salaire le plus bas.
        Employe employeWithMinSalary = employes.stream().min(Comparator.comparing(Employe::getSalary)).get();
        System.out.println("L'employé avec le salaire le plus bas, "+employeWithMinSalary.getNom()+", ayant comme le salaire "+employeWithMinSalary.getSalary());
        //Utiliser filter pour obtenir la liste des employés ayant un salaire supérieur à une valeur donnée.
        System.out.print("Saisie un salaire : ");
        Double salaire = Double.parseDouble(scanner.nextLine());
        List<Employe> employesWithSalaireBiggerThan = employes.stream()
                .filter(e-> e.getSalary()>salaire).collect(Collectors.toList());
        System.out.println("Les employees ayant un salaire superieure a "+salaire);
        for (Employe employe : employesWithSalaireBiggerThan) {
            System.out.println(employe.getNom()+" avec salaire de "+employe.getSalary());
        }
        //Utilisez reduce pour trouver l'employé avec le salaire le plus élevé dans l'ensemble de
        //l'entreprise.
        Employe employeWthHigherSalary = employes.stream()
                .reduce((emp1, emp2)-> emp1.getSalary()>emp2.getSalary()?emp1 : emp2).get();
        System.out.println("L'employee avec le salaire plus élevé est "+employeWthHigherSalary.getNom()+" avec un salaire de "+employeWthHigherSalary.getSalary());
        //Utilisez reduce pour concaténer les noms de tous les employés
        String allNames = employes.stream()
                .map(employe -> employe.getNom())
                .reduce((nom1, nom2)->nom1+" "+nom2).get();
        System.out.println(allNames);
    }
}

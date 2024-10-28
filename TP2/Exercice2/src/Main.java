public class Main {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("Mohamed", "Ahmed", "mohamed.ahmed@gmail.com", "+21287435892",14500.00, "Back-End");
        System.out.println("-----Les informtions sur ingenieur-----");
        System.out.println(ingenieur.toString());
        System.out.println("Le salaire apres l'augmentation est: "+ingenieur.calculerSalire());
        Manager manager = new Manager("Wilfried", "Zaha", "zaha002@gmail.com", "+212723109644", 25000.00, "IT");
        System.out.println("-----Les informations sur manager-----");
        System.out.println(manager.toString());
        System.out.println("Le salaire apres l'augmentation est: "+manager.calculerSalire());
    }
}
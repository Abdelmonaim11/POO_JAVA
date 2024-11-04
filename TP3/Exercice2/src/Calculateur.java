public class Calculateur {
    public Calculateur(){

    }
    public static void testRacineCarree(int number) throws RacineCarreeException {
        if (number < 0) throw new RacineCarreeException(number);
    }

    public static void main(String[] args) {

            Calculateur calculateur = new Calculateur();
        try {
            testRacineCarree(-5);
            testRacineCarree(25);
        } catch (RacineCarreeException e) {
            System.out.println("Détectée erreurs : " + e.getMessage());
        }

    }
}

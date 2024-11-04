public class Vehicule {
    public Vehicule(){

    }
    public static void testVitesse(int number) throws TropViteException {
        if (number > 90) throw new TropViteException(number);

    }

    public static void main(String[] args) throws TropViteException {
        Vehicule vehicule = new Vehicule();
        testVitesse(20);
        testVitesse(100);
    }
}

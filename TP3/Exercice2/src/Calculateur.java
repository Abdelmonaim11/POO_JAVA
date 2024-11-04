public class Calculateur {
    public Calculateur(){

    }
    public void testRacineCarree(int number) throws RacineCarreeException {
        if (number < 0) throw new RacineCarreeException(number);
    }
}

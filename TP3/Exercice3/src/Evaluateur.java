public class Evaluateur {
    public Evaluateur(){

    }
    public static void verifierNote(int number) throws NoteInvalideException {
        if (number<0 || number>20) throw new NoteInvalideException(number);
    }

    public static void main(String[] args) {
        Evaluateur evaluateur = new Evaluateur();
        try {
            verifierNote(-7);
            verifierNote(12);
        }catch (NoteInvalideException e){
            e.getMessage();
        }
    }
}

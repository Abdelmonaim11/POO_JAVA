import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DossierContactMain {
    public static void main(String[] args) throws IOException, InterruptedException {
//        List<String> names = Arrays.asList("Monaim", "Amine", "Mouad", "Ayoub");
//        List<String> phoneNumbers = Arrays.asList("0623049332", "0634234312", "06342341223", "06234324234");
        DossierContact dossierContact = new DossierContact();
//        dossierContact.setNamesList(names);
//        dossierContact.setPhoneNumbersList(phoneNumbers);
//        dossierContact.addContact();
        //dossierContact.deleteContact("Monaim");
      //  dossierContact.searchContact("Amine");
        dossierContact.updatePhoneNumber("Mouad", "07342342212");
    }
}

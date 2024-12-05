import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DossierContact {
    private List<String> namesList = new ArrayList<>();
    private List<String> phoneNumbersList = new ArrayList<>();
    private String dir = "E:\\D\\Master_SDIA\\POO_JAVA\\contacts";

    public List<String> getNamesList() {
        return namesList;
    }

    public void setNamesList(List<String> namesList) {
        this.namesList = namesList;
    }

    public List<String> getPhoneNumbersList() {
        return phoneNumbersList;
    }

    public void setPhoneNumbersList(List<String> phoneNumbersList) {
        this.phoneNumbersList = phoneNumbersList;
    }

    public void addContact(){
        for (int i=0; i< namesList.size(); i++){
            File file = new File(dir+"\\"+namesList.get(i));
            try {
                if (file.createNewFile()){
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(phoneNumbersList.get(i));
                    fileWriter.close();
                }else {
                    System.out.println("The contact with name "+namesList.get(i)+"is already exists!!!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

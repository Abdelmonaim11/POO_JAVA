import java.io.*;
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
    public void deleteContact(String name){
        File file = new File(dir+"\\"+name);
        if(file.exists()){
            file.delete();
        }else {
            System.out.println("File deosn't existe!!!");
        }
    }
    public void searchContact(String name) throws IOException {
        File file = new File(dir+"\\"+name);
        if (file.exists()){
            String getAbsolutePath = file.getAbsolutePath();
            String fileName = name;
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String phoneNumber = String.valueOf(bufferedReader.readLine());
            System.out.println("File's absolute path -> "+getAbsolutePath);
            System.out.println("File's name -> "+fileName);
            System.out.println("Phone number is -> "+phoneNumber);
            bufferedReader.close();
            fileReader.close();
        }
    }
}

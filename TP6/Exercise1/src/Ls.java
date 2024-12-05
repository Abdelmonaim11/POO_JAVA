import java.io.File;

public class Ls {
    public void inputsOutputsList(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            String type = f.isDirectory() ? "<DIR>" : "<FILE>";
            String typeOfOpen = "";
            if (f.canRead()){
                typeOfOpen+="r";
            }else typeOfOpen+="-";
            if (f.canWrite()){
                typeOfOpen+="w";
            }else typeOfOpen+="-";
            if (f.isHidden()){
                typeOfOpen+="h";
            }else typeOfOpen+="-";
            System.out.println(f.getPath()+" "+type+" "+typeOfOpen);
            if (f.isDirectory()){
                inputsOutputsList(f);
            }
        }
    }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileScanner {

    private String[] arg;

    public FileScanner(String[] arg) {
        this.arg = arg;
    }
    public String[] read(){
        File file = new File(arg[arg.length - 1]);
        char [] data = new char[(int) file.length()];
        try {
            FileReader fileReader = new FileReader(file);
            try {
                fileReader.read(data,0, (int) file.length());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String records = new String(data);
        return  records.split("\n");
    }
}
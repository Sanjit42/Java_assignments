
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sanjitd on 08/03/16.
 */
 public class Label {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileReader fileReader = new FileReader(file);
        char [] data = new char[(int) file.length()];
        fileReader.read(data);
        String content = new String(data);
        String[] splittedContent = content.split("\n");
        for (int i = 0; i < splittedContent.length ; i++) {
            String []eachData = splittedContent[i].split(",");
            Address address = new Address(eachData[4], eachData[5], eachData[6]);
            int age = Integer.parseInt(eachData[3]);
            Name name = new Name(eachData[0], eachData[1]);
            Gender gender = Gender.valueOf(eachData[2]);
            Person person = new Person(name,gender,age,address);
            System.out.println(person.getInfoForFemaleWithAge());
        }
    }
}

import java.util.ArrayList;

public class LabelPrint {
    private String [] content;
    public LabelPrint(String[] contents) {
        this.content = contents;
    }

    public ArrayList<Person> operateData() {
         ArrayList<Person> guestList = new ArrayList<>();
        for (int i = 0; i <content.length; i++) {
            String[] eachData = content[i].split(",");
            Address address = new Address(eachData[4], eachData[5], eachData[6]);
            int age = Integer.parseInt(eachData[3]);
            Name name = new Name(eachData[0], eachData[1]);
            Gender gender = Gender.valueOf(eachData[2]);
            Person person = new Person(name, gender, age, address);
            guestList.add(person);
        }
        return guestList;
    }
}
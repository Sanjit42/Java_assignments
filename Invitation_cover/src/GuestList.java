import java.util.ArrayList;

public class GuestList {
    private Person parson;

    public GuestList(Person person) {
        this.parson = person;
    }

    public ArrayList<Person> eachPerson (){
        ArrayList<Person> eachPerson = new ArrayList<>();
        eachPerson.add(parson);
        return eachPerson;
    }
}


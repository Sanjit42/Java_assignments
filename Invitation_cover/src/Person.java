/**
 * Created by sanjitd on 07/03/16.
 */
public class Person {
    private Gender gender;
    private Name name;
    private Address address;

    public Person(String firstName, String lastName, Gender gender, int age, String city, String state, String country) {
        this.gender = gender;
        this.name = new Name(firstName, lastName);
        this.address = new Address(city, state, country);
    }
    public String getInformationForMail(){
        return gender +" "+ this.name.toFirstLastName()+ " "+address.getCountry();
    }
    public String getInformationForFemail(){
        return gender +" "+ this.name.toLastFirstName()+ " "+address.getCountry();
    }
}

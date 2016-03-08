/**
 * Created by sanjitd on 07/03/16.
 */
public class Person {
    private Address address;
    private Gender gender;
    private Name name;
    private int age;
    public Person(String firstName, String lastName,Gender gender, int age, String city, String state, String country) {
        this.gender = gender;
        this.age = age;
        this.name = new Name(firstName, lastName);
        this.address = new Address(city, state, country);
    }
    public String getPersonNameFirst(){
        return gender +" "+ this.name.toFirstLastName();
    }
    public String getPersonNameLast(){
        return gender +" "+ this.name.toLastFirstName();
    }
    public String getInfoForMail(){
        return gender +" "+ this.name.toFirstLastName()+ ", "+address.getCountry();
    }
    public String getInfoForFemail(){
        return gender +" "+ this.name.toLastFirstName()+ ", "+address.getCountry();
    }
    public String getInfoForMaleWithAge(){
        return gender +" "+ this.name.toFirstLastName()+ " "+address.getCountry()+ ", " + this.age;
    }
    public String getInfoForFemaleWithAge(){
        return gender +" "+ this.name.toLastFirstName()+ ", "+address.getCountry()+ ", " + this.age;
    }
}

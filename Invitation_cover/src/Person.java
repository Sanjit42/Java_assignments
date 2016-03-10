public class Person {
    private Address address;
    private Gender gender;
    private Name name;
    private int age;
    public Person(Name name, Gender gender, int age, Address address) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public String getPersonNameFirst(){
        return gender +" "+ this.name.toFirstLastName();
    }
    public String getPersonNameLast(){
        return gender +" "+ this.name.toLastFirstName();
    }
    public String getInfoForMale(){
        return gender +" "+ this.name.toFirstLastName()+ ", "+address.getCountry();
    }
    public String getInfoForFemale(){

        return gender +" "+ this.name.toLastFirstName()+ ", "+address.getCountry();
    }
    public String getInfoForMaleWithAge(){
        return gender +" "+ this.name.toFirstLastName()+ " "+address.getCountry()+ ", " + this.age;
    }
    public String getInfoForFemaleWithAge(){
        return gender +" "+ this.name.toLastFirstName()+ ", "+address.getCountry()+ ", " + this.age;
    }
}

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
    public String getFormalInfo(){
        return gender + " " +this.name.toFirstLastName();
    }
    public String getInformalInfo(){
        return gender + " " +this.name.toLastFirstName();
    }
    public String getFormalInfoWithCountry(){
        return gender +" "+ this.name.toFirstLastName()+ ", "+address.getCountry();
    }
    public String getInformalInfoWithCountry(){
        return gender +" "+ this.name.toLastFirstName()+ ", "+address.getCountry();
    }
    public String getFormalInfoWithCountryAndAge(){
        return gender +" "+ this.name.toFirstLastName()+ ", "+address.getCountry()+ ", " + this.age;
    }
    public String getInformalInfoWithCountryAndAge(){
        return gender +" "+ this.name.toLastFirstName()+ ", "+address.getCountry()+ ", " + this.age;
    }
}

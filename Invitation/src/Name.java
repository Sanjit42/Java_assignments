/**
 * Created by sanjitd on 07/03/16.
 */
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toFirstLastName(){

        return firstName+ " " + lastName;
    }
    public String toLastFirstName(){
        return lastName+ ", " +firstName;
    }
}

/**
 * Created by sanjitd on 07/03/16.
 */
public class Name {
    private static String firstName;
    private static String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static String toFirstLastName(){

        return firstName+ " " + lastName;
    }
    public static String toLastFirstName(){
        return String.format("%s, %s", lastName, firstName);
    }
}

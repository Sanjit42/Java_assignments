import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by sanjitd on 07/03/16.
 */
public class PersonTest {
    @Test
    public void test_for_person_name_prefixed_name_first(){
        Name name = new Name("Atonu", "Das");
        assertEquals("Atonu Das", name.toFirstLastName());
    }
    @Test
    public void test_for_person_name_prefixed_name_last(){
        Name name = new Name("Atonu", "Das");
        assertEquals("Das, Atonu", name.toLastFirstName());
    }
    @Test
    public void test_for_person_name_prefixed_surname_last(){
        Person person = new Person("Ram","Roy",Gender.Male, 22,"Chennai","Tamilnaru","India");
        assertEquals("Mr Ram Roy, India",person.getInfoForMail());
    }
    @Test
    public void test_for_person_name_prefixed_surname_first(){
        Person person = new Person("Riya","Roy",Gender.Female, 22,"Chennai","Tamilnaru","India");
        assertEquals("Ms Roy, Riya, India",person.getInfoForFemail());
    }
}

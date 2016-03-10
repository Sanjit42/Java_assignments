import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sanjitd on 07/03/16.
 */
public class PersonTest {
    Address address;
    Gender male, female;
    @Before
    public void setUp() throws Exception {
        address = new Address("Chennai", "Tamilnaru", "India");
        male = Gender.Male;
        female = Gender.Female;
    }
    @Test
    public void test_for_person_name_prefixed_name_first() {
        Name name = new Name("Atonu", "Das");
        assertEquals(name.toFirstLastName(), "Atonu Das");
    }
    @Test
    public void test_for_person_name_prefixed_name_last() {
        Name name = new Name("Atonu", "Das");
        assertEquals(name.toLastFirstName(), "Das, Atonu");
    }
    @Test
    public void test_for_person_name_prefixed_surname_last() {
        Name name = new Name("Atonu", "Das");
        Person person = new Person(name, male, 22, address);
        assertEquals("Mr Atonu Das, India", person.getInfoForMale());
    }    @Test
    public void test_for_female_person_name_prefixed_surname_last() {
        Name name = new Name("Anita", "Das");
        Person person = new Person(name, female, 22, address);
        assertEquals("Ms Das, Anita, India", person.getInfoForFemale());
    }
    @Test
    public void test_for_person_name_prefixed_surname_first(){
        Name name = new Name("Riya", "Roy");
        Person    person = new Person(name, male, 22, address);
        assertEquals("Mr Roy, Riya, India, 22",person.getInfoForFemaleWithAge());
    }
}

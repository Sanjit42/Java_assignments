import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void testPerson_should_give_formal_info_of_a_person() {
        Name name = new Name("Atonu", "Das");
        Person person = new Person(name,male,23, address);
        assertEquals(person.getFormalInfo(), "Mr Atonu Das");
    }
    @Test
    public void testPerson_should_give_informal_info_of_a_person() {
        Name name = new Name("Amrita", "Sinha");
        Person person = new Person(name,female,23, address);
        assertEquals(person.getInformalInfo(), "Ms Sinha, Amrita");
    }
    @Test
    public void testPerson_should_give_informal_info_of_a_person_with_country_name() {
        Name name = new Name("Rahi", "Biswas");
        Person person = new Person(name, female, 22, address);
        assertEquals("Ms Rahi Biswas, India", person.getFormalInfoWithCountry());
    } @Test
    public void testPerson_should_give_formal_info_of_a_person_with_country_name() {
        Name name = new Name("Abhijit", "Raha");
        Person person = new Person(name, male, 24, address);
        assertEquals("Mr Abhijit Raha, India", person.getFormalInfoWithCountry());
    }
    @Test
    public void testPerson_should_give_informal_info_of_a_person_with_country_name_and_age(){
        Name name = new Name("Riya", "Roy");
        Person    person = new Person(name, female, 22, address);
        assertEquals("Ms Roy, Riya, India, 22",person.getInformalInfoWithCountryAndAge());
    }    @Test
    public void testPerson_should_give_formal_info_of_a_person_with_country_name_and_age(){
        Name name = new Name("Riya", "Roy");
        Person    person = new Person(name, female, 22, address);
        assertEquals("Ms Riya Roy, India, 22",person.getFormalInfoWithCountryAndAge());
    }
}

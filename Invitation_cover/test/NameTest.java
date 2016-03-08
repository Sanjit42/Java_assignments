import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sanjitd on 08/03/16.
 */
public class NameTest {
    @Test
    public void test__toFirstLastName_returns_surname_last(){
        Name name = new Name("Ritesh", "Das");
        assertEquals("Ritesh Das", name.toFirstLastName());
    }
    @Test
    public void test_toLastFirstName_it_should_returns_surname_first(){
        Name name = new Name("Atonu", "Halder");
        assertEquals("Halder, Atonu", name.toLastFirstName());
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by sanjitd on 08/03/16.
 */
public class AddressTest {
    @Test
    public void test_for_get_country_name(){
        Address country = new Address("Bongaon", "WB","India");
        assertEquals("India", country.getCountry());
    }
    @Test
    public void test_it_should_give_country_name(){
        Address country = new Address("West Shanna", "South Carolina", "Bangladesh");
        assertEquals("Bangladesh", country.getCountry());
    }
    @Test
    public void test_it_should_not_give_India(){
        Address country = new Address("West Shanna", "South Carolina", "Bangladesh");
        assertNotEquals("India", country.getCountry());
    }
}

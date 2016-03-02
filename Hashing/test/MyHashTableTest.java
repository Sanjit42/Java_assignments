import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashTableTest {
    @Test
    public void testput_should_put_keys_value_in_the_table() {
        MyHashTable myHashTable = new MyHashTable(3);
        myHashTable.put("India", "Delhi");
        assertEquals(1, myHashTable.getLength());
    }
    @Test
    public void testget_should_get_value_from_the_table_if_give_key () {
        MyHashTable myHashTable = new MyHashTable(3);
        myHashTable.put("India", "Delhi");
        assertEquals("Delhi", myHashTable.get("India"));
    }
    @Test
    public void test_get_values_from_the_table(){
        MyHashTable myHashTable = new MyHashTable(5);
        myHashTable.put("India","Delhi");
        myHashTable.put("Bangaladesh","Dhaka");

        assertEquals("Dhaka", myHashTable.get("Bangaladesh"));
        assertEquals("Delhi", myHashTable.get("India"));
        assertEquals(2, myHashTable.getLength());
    }

    @Test
    public void test_isPresent_return_true_if_given_key_is_present_in_the_table(){
        MyHashTable myHashTable = new MyHashTable(3);
        myHashTable.put("West Bengal", "Kolkata");
        myHashTable.put("Karnataka", "Bangalore");

        assertTrue(myHashTable.isPresent("Karnataka"));
    }

    @Test
    public void test_isPresent_return_false_if_given_key_not_present_in_the_table(){
        MyHashTable myHashTable = new MyHashTable(3);
        myHashTable.put("West Bengal", "Kolkata");
        myHashTable.put("Maharastra", "Mumbai");
        myHashTable.put("Karnataka", "Bangalore");
        assertFalse(myHashTable.isPresent("ABC"));
        assertFalse((myHashTable.isPresent("Karnat")));

    }
    @Test
    public void testremove_should_remove_given_key_from_table(){
        MyHashTable myHashTable = new MyHashTable(4);
        myHashTable.put("Karnataka", "Bangalore");
        myHashTable.put("West Bengal", "Kolkata");

        assertEquals(2, myHashTable.getLength());
        assertTrue(myHashTable.isPresent("Karnataka"));
        myHashTable.remove("West Bengal");
        assertEquals(1, myHashTable.getLength());
        assertFalse(myHashTable.isPresent("West Bengal"));
    }

    @Test
    public void test_remove_all_value_from_the_table(){
        MyHashTable myHashTable = new MyHashTable(10);
        myHashTable.put("West Bengal", "Kolkata");
        myHashTable.put("Maharastra", "Mumbai");
        myHashTable.put("Karnataka", "Bangalore");
        myHashTable.put("Andhraprodesh", "Hyderabad");
        myHashTable.removeAll();

        assertFalse(myHashTable.isPresent("Karnataka"));
    }
}
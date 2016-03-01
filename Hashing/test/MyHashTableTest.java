import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashTableTest {
    @Test
    public void testput_should_put_keys_value_in_the_table() {
        MyHashTable myHashTable = new MyHashTable(3);
        myHashTable.put("India", "Dilhi");
        assertEquals(1, myHashTable.getLength());
    }
}
import java.util.ArrayList;


public class MyHashTable {
    private Object[] values;
    private Object[] keys;

    private int length = 0;
    private int boundary;

    public MyHashTable(int size) {
        values = (size % 2 == 0) ? new Object[size + 1] : new Object[size];
        keys = (size % 2 == 0) ? new Object[size + 1] : new Object[size];
        length = 0;
        boundary = size;
    }

    public int hash(String keys) {
        long hash = 7;
        for (int i = 0; i < keys.length(); i++) {
            hash = (hash * 31 + keys.charAt(i)) % boundary;
        }
        return (int) (Math.abs(hash) % boundary);
    }

    public void put(String key, Object value){
        length++;
        int index = (int) (int) hash(key);

        if(values[index] == null){
            values[index] = value;
            keys[index] = key;
            return;
        }
        ArrayList innerValues = new ArrayList();
        ArrayList innerKeys = new ArrayList();

        if(!(values[index] instanceof ArrayList)){

            innerValues.add(values[index]);
            innerKeys.add(keys[index]);

            values[index] = innerValues;
            keys[index] = innerKeys;
        }

        innerValues.add(value);
        innerKeys.add(key);
    }

    public Object get(String key) {
        int index = (int) (int) hash(key);
        if (values[index] instanceof ArrayList) {
            return ((ArrayList) values[index]).get(((ArrayList) keys[index]).indexOf(key));
        }
        return values[index];
    }

    public void remove(String key){
        length--;
        int index = (int) (int) hash(key);
        if(values[index] instanceof ArrayList){
            int removeItem = ((ArrayList)keys[index]).indexOf(key);
            ((ArrayList)keys[index]).remove(removeItem);
            ((ArrayList)values[index]).remove(removeItem);
        }
        keys[index] = null;
        values[index] = null;
    };


    public boolean isPresent(String key) {
        int index = (int) (int) hash(key);
        return ((keys[index]) != null);
    }

    public void removeAll(){
        for (int i = 0; i < boundary; i++){
            keys[i] = null;
            values[i] = null;
            length = 0;
        }
    }

    public int getLength() {
        return length;
    }
}

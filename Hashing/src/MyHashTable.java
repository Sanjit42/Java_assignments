import  java.util.ArrayList;

public class MyHashTable {
    private Object [] values;
    private Object [] keys;

    private int length;
    private int boundry;

    public MyHashTable(int size){
        values = (size % 2 == 0) ?new Object[size+1] : new Object[size];
        keys = (size % 2 == 0) ?new Object[size+1] : new Object[size];
        length = 0;
        boundry = size;
    }

    private long hash (String keys){
        long hash = 7;
        for (int i = 0; i<keys.length(); i++){
            hash = (hash * 31 + keys.charAt(i))%boundry;
        }
        return (int) (Math.abs(hash) % boundry);
    }

    public void put(String key, Object value){
        length++;
        int index = (int) (int) hash(key);
        if (values[index] == null){
           values[index] = value;
            keys[index] = key;
            return;
        }
        ArrayList innerValues = new ArrayList();
        ArrayList innerKeys = new ArrayList();
        if (!(values[index] instanceof ArrayList)){
            innerValues.add(values[index]);
            innerValues.add(keys[index]);

            values[index] = innerValues;
            keys[index] = innerKeys;
        }
        innerValues.add(value);
        innerKeys.add(key);
    }

    public int getLength(){
        return length;
    }
//     public void print(){
//        for(int i = 0; i < keys.length; i++) {
//            System.out.println(keys[i] + " " + values[i]);
//        }
// }
//    public static void main(String[] args) {
//        MyHashTable myHashTable = new MyHashTable(5);
//        myHashTable.put("India", "dilhi");
//        myHashTable.put("Indi", "dili");
//        myHashTable.put("Inda", "dihi");
//        myHashTable.put("Inia", "dlhi");
//        myHashTable.put("Idia", "ilhi");
//        myHashTable.put("ndia", "wdilhi");
//        myHashTable.print();
//    }
}

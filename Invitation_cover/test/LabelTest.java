import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LabelTest {
    private String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
            " Ola,Kreiger,Male,36,Katlynn view,Vermont,Romania\n" +
            "Rodolfo,Balistreri,Male,32,Crooks ton,Georgia,Bangladesh\n" +
            "Juana,Champlin,Female,26,West Shanna,Georgia,Bangladesh";
    @Test
    public void testLabelPrint_gives_informal_info() {
        LabelPrint label = new LabelPrint(data.split("\n"));
        ArrayList<Person> guests = label.operateData();
        Person person = guests.get(0);
        assertEquals(person.getInformalInfo(),"Ms Barrows, Julius");
    }
    @Test
    public void testLabelPrint_gives_formal_info() {
        LabelPrint label = new LabelPrint(data.split("\n"));
        ArrayList<Person> guests = label.operateData();
        Person person = guests.get(3);
        assertEquals(person.getFormalInfoWithCountryAndAge(),"Ms Juana Champlin, Bangladesh, 26");
    }
}

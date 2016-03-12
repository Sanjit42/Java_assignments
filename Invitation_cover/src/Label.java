import java.util.ArrayList;

public class Label {
    public static void main(String[] args) throws Exception {
        CommandLineArgu commandLineArgu = new CommandLineArgu(args);
        FileScanner fileScanner = new FileScanner(args);
        String[] content = fileScanner.read();
        LabelPrint labels = new LabelPrint(content);
        ArrayList<Person> guestList = labels.operateData();
        for (Person p : guestList) {
            System.out.println(  p.getInformalInfo());
        }
    }
}
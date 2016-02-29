import java.util.ArrayList;
import java.util.List;

public class WC {
    private final String data;
    List<Scanner> scanners;

    public WC(String data) {
        this.data = data;
        scanners = new ArrayList<Scanner>();
    }

    public void addScanner(Scanner scanner) {
        scanners.add(scanner);
    }

    private void scan(char c) {
        for (Scanner scanner : scanners) {
            scanner.scan(c);
        }
    }
    
    public String count() {
        String summary = "";
        for (int i = 0; i < data.length(); i++) {
            scan(data.charAt(i));
        }
        for (Scanner scanner : scanners) {
           summary =  summary.concat(scanner.toString());
        }
        return summary;
    }

}

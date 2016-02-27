/**
 * Created by dataanjitd on 27/02/16.
 */
public class CharacterScanner implements Scanner {
    private int count;

    public CharacterScanner() {
        this.count = 0;
    }

    public void scan(char c) {
        count++;
    }

    @Override
    public String toString() {
        return count+"";
    }
}

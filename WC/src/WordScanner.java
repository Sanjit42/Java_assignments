public class WordScanner implements Scanner {
    private int count;

    public WordScanner() {
        this.count = 0;
    }

    @Override
    public void scan(char c) {
        if (c == ' ')
            count++;
    }
    @Override
    public String toString() {
        return count+"";
    }
}

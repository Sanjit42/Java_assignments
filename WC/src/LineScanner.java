public class LineScanner implements Scanner {
    private int count;

    public LineScanner() {
        this.count = 0;
    }

    @Override
    public void scan(char c) {
        if (c == '\n')
            count++;
    }
    @Override
    public String toString() {
        return count+"";
    }
}

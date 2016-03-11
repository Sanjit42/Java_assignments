public class Label {
    public static void main(String[] args)throws Exception {
        CommandLineArgu commandLineArgu = new CommandLineArgu(args);
        FileScanner fileScanner = new FileScanner(args);
        String content = fileScanner.read();
        LabelPrint labelPrint = new LabelPrint(content);
    }
}
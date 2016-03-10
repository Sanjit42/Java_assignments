public class Label {
    public static void main(String[] args)throws Exception {
        CommandLineArgu commandLineArgu = new CommandLineArgu(args);
        System.out.println(commandLineArgu.createField().get("--nameFormat"));
//        FileScanner fileScanner = new FileScanner(args);
//        String content = fileScanner.read();
//        LabelPrint labelPrint = new LabelPrint(content);
//        System.out.println(labelPrint.operateData());
    }
}
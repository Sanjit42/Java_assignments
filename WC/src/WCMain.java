 import java.io.*;

 class WCMain {
    public static void main(String[] args) throws Exception {
       File file = new File(args[0]);
       char [] data = new char[(int) file.length()];
       FileReader fileReader = new FileReader(file);
       fileReader.read(data);
       String content = new String(data);

       WC wc = new WC(content);
       String lines = wc.count();
       String words = wc.count();
       String characters = wc.count();

       System.out.println("No of lines are:- " +lines  );
       System.out.println("No of words are:- " +words);
       System.out.println("No of characters are:- " +characters);
    }
 }

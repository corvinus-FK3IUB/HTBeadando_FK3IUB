package titkositas;

import java.io.*;
import java.nio.charset.Charset;

public class Titkosit {
    public static void main(String args[]) throws IOException {
        OutputStream out = new FileOutputStream("titkositotteredmeny.txt");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("titkositandoszo.txt"), Charset.forName("UTF-8")));
        int c;
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            character++;
            out.write(character);
            //System.out.println(character);
        }
        out.flush();
        reader.close();
        out.close();
    }
}

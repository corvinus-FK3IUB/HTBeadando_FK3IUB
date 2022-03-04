package titkositas;

import java.io.*;
import java.nio.charset.Charset;

public class TitkositCsakBetu {
    public static void main(String args[]) throws IOException {
        OutputStream out = new FileOutputStream("titkositotteredmenybetuk.txt");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("titkositandobetuk.txt"), Charset.forName("UTF-8")));
        int c;
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                if (character == 'z') {
                    character = 'a';
                } else {
                    character++;
                }
            } else {
                System.out.println("Hiba, csak betűket írhat inputként! Ez nem az ABC egyik betűje: "+character+'!');
            }
            out.write(character);
            //System.out.println(character);
        }
        out.flush();
        reader.close();
        out.close();
    }
}

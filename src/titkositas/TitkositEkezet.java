package titkositas;

import java.io.*;
import java.nio.charset.Charset;

public class TitkositEkezet {
    public static void main(String args[]) throws IOException {
        OutputStream out = new FileOutputStream("titkositotteredmenyekezet.txt");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("titkositandoekezetes.txt"), Charset.forName("UTF-8")));
        int c;
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            switch (character) {
                case 'á':
                    character = 'a';
                    break;
                case 'é':
                    character = 'e';
                    break;
                case 'í':
                    character = 'i';
                    break;
                case 'ó':
                    character = 'o';
                    break;
                case 'ö':
                    character = 'o';
                    break;
                case 'ő':
                    character = 'o';
                    break;
                case 'ú':
                    character = 'u';
                    break;
                case 'ü':
                    character = 'u';
                    break;
                case 'ű':
                    character = 'u';
                    break;
            }
            character++;
            out.write(character);
            //System.out.println(character);
        }
        out.flush();
        reader.close();
        out.close();
    }
}

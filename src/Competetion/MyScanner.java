package Competetion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MyScanner {

    public MyScanner() {
        try {
            InputStream input = new FileInputStream("input.txt");
//            int byteFromInput = input.read();
//            while (byteFromInput != -1) {
//                System.out.print((char)byteFromInput);
//                byteFromInput = input.read();
//            }

            Path pathOfFile = Paths.get("input.txt");
            long sizeOfFile = Files.size(pathOfFile);

            byte bytes[] = new byte[(int) sizeOfFile];

            input.read(bytes);

            String lineFromFile = new String(bytes);
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] >= 30 && bytes[i] <= 39) {

                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int nextInt(InputStream input) {

        return 0;
    }
}
/* считать цифру преобразовать в int , * 10 ...
из файла считать числа... реализация nextInt();
*/

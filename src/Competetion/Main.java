package Competetion;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("CompetetionFile.txt");

            for (int i = 0; i < scanner.nextInt(); i++) {
                String text = scanner.next();
                byte bytes[] = text.getBytes();
                output.write(bytes);
            }
            output.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            InputStream input = new FileInputStream("input.txt");
//            int byteFromInput = input.read();
//            while (byteFromInput != -1) {
//                System.out.print((char)byteFromInput);
//                byteFromInput = input.read();
//            }

            Path pathOfFile = Paths.get("input.txt");
            long sizeOfFile = Files.size(pathOfFile);

            byte bytes[] = new byte[(int)sizeOfFile];

            input.read(bytes);
            String lineFromFile = new String(bytes);
            System.out.println(lineFromFile);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

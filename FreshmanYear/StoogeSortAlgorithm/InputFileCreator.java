package StoogeSortAlgorithm;

import java.io.*;
import java.util.Random;

public class InputFileCreator {
    private String fileName;
    private int theNumberOfArrays = 50 + random.nextInt(50);
    public int[][] data = new int[theNumberOfArrays][];
    private static BufferedWriter writer;
    private static Random random = new Random();

    public InputFileCreator(String fileName) {
        this.fileName = fileName;
    }

//    public String getFileName() {
//        return fileName;
//    }
//
//    public int[][] getData() {
//        return data;
//    }

//    private void numberGenerator() {
//        int[] inputData = new int[100 + random.nextInt(9990)];
//        boolean hasEquals = false;
//        for (int i = 0; i < inputData.length; i++) {
//            inputData[i] = random.nextInt(100);
//        }
//    }


    public void writeRandomInputFile() throws IOException {
        writer = new BufferedWriter(new FileWriter(new File(fileName)));
        for (int k = 0; k < theNumberOfArrays; k++) {
            data[k] = new int[100 + random.nextInt(900)];
            for (int i = 0; i < data[k].length; i++) {
                data[k][i] = random.nextInt(100);
                writer.write(String.valueOf(data[k][i]));
                writer.write(" ");
            }
            writer.write("\n");
        }
        writer.flush();
    }

    public int[][] readArrayFromFile() {
        try {
            File file = new File(fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String strLine;
            int i = 0;
            while ((strLine = reader.readLine()) != null) {
                int array[] = stringToInt(strLine.split(" "));
                data[i] = array;
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private int[] stringToInt(String[] intAsString) {
        int[] ints = new int[intAsString.length];
        for (int counts = 0; counts < intAsString.length; counts++) {
            ints[counts] = Integer.parseInt(intAsString[counts]);
        }
        return ints;
    }


//    public void showFile() {
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                System.out.print(data[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
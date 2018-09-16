package OptimizationOfTheTree;

import java.io.*;

public class TreeBalancer {

    public int howMuchNodeToAdd(String filename) {
        int result = 0;
        try {
            File file = new File(filename);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String data[] = reader.readLine().split(" ");
            int numberOfNodes = Integer.parseInt(data[0]);
            int maxNumberOfChildren = Integer.parseInt(data[1]);
            int[] countNodesChildren = new int[numberOfNodes];
            String strLine;

            for (int i = 1; i < countNodesChildren.length && (strLine = reader.readLine()) != null; i++) {
                countNodesChildren[Integer.parseInt(strLine)]++;
            }

            for (int i = 0; i < countNodesChildren.length; i++) {
                if (countNodesChildren[i] > maxNumberOfChildren) {
                    result += toCountAdded(countNodesChildren[i], maxNumberOfChildren);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private double toCountAdded(int a, int b) {

        int result = 0;
        int capasity = b;
        while (a > capasity) {
            result++;
            capasity += b - 1;
        }
        return result;
    }
}

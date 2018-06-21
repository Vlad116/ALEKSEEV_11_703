package DfsTask;

import java.io.*;
import java.util.Scanner;

public class DFSTask {
    private static Scanner sc = new Scanner(System.in);
    private int[][] inputArray;
    private boolean[] marks;
    private int vertexs;
    private int edges;

    public boolean[] getMarks() {
        return marks;
    }

    void readMatrix(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            int size = Integer.parseInt(bufferedReader.readLine());

            String data = bufferedReader.readLine();

            int j = 0;

            inputArray = new int[size][size];

            while (data != null) {

                String line[] = data.split(" ");

                for (int i = 0; i < line.length; i++) {

                    inputArray[i][j] = Integer.parseInt(line[i]);

                }

                j++;
                data = bufferedReader.readLine();
            }

            vertexs = size;
            marks = new boolean[vertexs];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void inputByConsole() {

        int x = sc.nextInt();
        inputArray = new int[x][x];

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                inputArray[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        marks = new boolean[x];

    }

    void dfs(int v) {

        if (marks[v-1]) {
            // Если мы здесь уже были выходим
            return;
        }

        marks[v-1] = true;   // Помечаем, что мы здесь были

        for (int i = v-1; i < inputArray[v-1].length; ++i)  // Для каждого ребра
        {
            if (inputArray[v-1][i] != 0) {
                edges++;
                dfs(i+1);  // Запускаем из соседей
            }
        }

    }

    void analyze() {

        boolean isNotNullLine = false;
        //boolean isTree = true;
        for (int i = 0; i < inputArray.length; i++) {
            isNotNullLine = false;
            if (inputArray[i][i] != 0) {
                System.out.println("Есть петля, не дерево!");
                return;
            }

            for (int j = 0; j < inputArray[i].length && !isNotNullLine; j++) {
                if (inputArray[i][j] != 0) {
                    isNotNullLine = true;
                }
            }

            if (!isNotNullLine) {
                System.out.println("Есть отдельностоящая вершина, не дерево!");
                return;
            }

        }

        dfs(1);

        for (int k = 0; k < marks.length; k++) {
            if (!marks[k]) {
                System.out.println("Не дерево!");
                return;
            }
        }


        if (edges == vertexs) {
            System.out.println("Граф!");
            return;
        } else if (edges == vertexs - 1) {
            System.out.println("Дерево!");
        }
    }

}

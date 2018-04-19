package StoogeSortAlgorithm;

import java.io.IOException;
import java.util.Arrays;

import StoogeSortAlgorithm.StoogeSort;

public class Main {
    public static void main(String[] args) throws IOException {

        InputFileCreator inputFileCreator = new InputFileCreator("inputData");
        inputFileCreator.writeRandomInputFile();
        int[][] testData = inputFileCreator.readArrayFromFile();
        long[] workTimeInMilliseconds = new long[testData.length];// Массив в котором каждый элемент - время выполнения сортировки в милисекундах на одном из массивов
        long[] workTimeInNanoseconds = new long[testData.length];// Массив в котором каждый элемент - время выполнения сортировки в наносекундах на одном из массивов
        int[] size = new int[testData.length];
        int[] countOfIterations = new int[testData.length];// Массив в котором каждый элемент - кол-во итераций затраченных на сортировку
        for (int i = 0; i < testData.length; i++) {
            long beforeMiliSeconds = System.currentTimeMillis();
            long beforeNanoSeconds = System.nanoTime();
            StoogeSort.stoogeSort(testData[i]);
            long afterMiliSeconds = System.currentTimeMillis();
            long afterNanoSeconds = System.nanoTime();
            long differenceInMiliSeconds = afterMiliSeconds - beforeMiliSeconds;
            long differenceInNanoSeconds = afterNanoSeconds - beforeNanoSeconds;
            workTimeInMilliseconds[i] = differenceInMiliSeconds;
            workTimeInNanoseconds[i] = differenceInNanoSeconds;
            size[i] = testData[i].length;
            countOfIterations[i] = StoogeSort.getIterationsCount();
        }

        for (int i = 0; i < testData.length; i++) {
            for (int j = 0; j < testData[i].length; j++) {
                System.out.print(testData[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество массивов поданных на вход:" + "\n" + testData.length + "\n");
        System.out.println("Размеры входных данных:");
        System.out.println(Arrays.toString(size) + "\n");
        System.out.println("Кол-во итераций проделанных алгоритмом:");
        System.out.println(Arrays.toString(countOfIterations) + "\n");
        System.out.println("Время работы сортировки в ms на различных входных данных:");
        showArray(workTimeInMilliseconds);
        System.out.println("Время работы сортировки в ns на различных входных данных:");
        showArray(workTimeInNanoseconds);
    }
////        int[] data = {874, 699, 486, 178, 771, 550, 933, 394, 978, 483, 975, 432, 803, 224, 516, 302, 996, 203, 942, 382, 601, 366, 801, 399, 497, 700, 877, 957, 851, 804, 955, 489, 230, 892, 820, 557, 852, 720, 649, 113, 138, 797, 620, 445, 655, 805, 752, 678, 958, 272, 994, 489, 649, 228, 810, 220, 741, 217, 852, 688, 160, 804, 164, 735, 300, 408, 265, 457, 351, 176, 316, 892, 564, 824, 307, 886, 330, 652, 207, 310, 822, 129, 678};
////        int[] ms = {478, 131, 127, 7, 566, 115, 703, 96, 711, 91, 468, 52, 457, 11, 97, 10, 437, 5, 421, 46, 90, 46, 549, 46, 92, 91, 433, 411, 453, 424, 412, 97, 11, 410, 422, 92, 432, 429, 97, 1, 1, 430, 90, 47, 91, 411, 443, 92, 416, 10, 417, 92, 95, 10, 423, 11, 432, 10, 438, 110, 6, 432, 6, 486, 13, 79, 12, 49, 53, 5, 11, 458, 90, 418, 10, 440, 82, 331, 11, 17, 592, 2, 147};
////        int[] iterathions = {128018, 78218, 37865, 7222, 88932, 54747, 155814, 29721, 161352, 40330, 161027, 34932, 96271, 10088, 42031, 17998, 171923, 8776, 158317, 25833, 62149, 24615, 102877, 29951, 42579, 81639, 121121, 161961, 116889, 97776, 161441, 40868, 9262, 133196, 106937, 52850, 117288, 81212, 76749, 2566, 4013, 100655, 69602, 37864, 80267, 98880, 84937, 84045, 162740, 15516, 168994, 41383, 74134, 10471, 101982, 8935, 86968, 8624, 117676, 79640, 5322, 103706, 5685, 87548, 18099, 34308, 13135, 39849, 23033, 6427, 20188, 129609, 57291, 111595, 18462, 127723, 19435, 82110, 8971, 18638, 102226, 3473, 84732};
////        for (int i = data.length - 1; i > 0; i--) {
////            for (int j = 0; j < i; j++) {
////                if (data[j] > data[j + 1]) {
////                    int tmp = data[j];
////                    int tempTime = ms[j];
////                    int tempIterathions = iterathions[j];
////                    data[j] = data[j + 1];
////                    ms[j] = ms[j + 1];
////                    iterathions[j] = iterathions[j + 1];
////                    data[j + 1] = tmp;
////                    ms[j + 1] = tempTime;
////                    iterathions[j + 1] = tempIterathions;
////                }
////            }
////        }
//
//        for (int l = 0; l < data.length; l++) {
//            System.out.print(data[l] + " ");
//        }
//        System.out.println();
//        for (int l = 0; l < ms.length; l++) {
//            System.out.print(ms[l] + " ");
//        }
//        System.out.println();
//        for (int l = 0; l < iterathions.length; l++) {
//            System.out.print(iterathions[l] + " ");
//        }
//    }


    public static void showArray(long[] array) {
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + " ");
        }
        System.out.println("\n");
    }
}
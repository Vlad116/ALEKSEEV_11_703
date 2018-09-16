package StoogeSortAlgorithm;

public class StoogeSort {
    private static int iterationsCount = 0;

    public static int getIterationsCount() {
        int temp = iterationsCount;
        setIterationsCount(0);
        return temp;
    }

    public static void setIterationsCount(int iterationsCount) {
        StoogeSort.iterationsCount = iterationsCount;
    }

    //Вызываем сортировку для всего массива
    static void stoogeSort(int arr[]) {
        stoogeSort(arr, 0, arr.length - 1);
    }

    static void stoogeSort(int arr[], int left, int right) {
        int temp, third;
        // Сравниваем / меняем элементы на концах отрезка
        if (arr[left] > arr[right]) {
            iterationsCount++;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        //Проверяем не меньше ли трех
        if (left + 1 >= right) return;

        //Считаем одну треть
        third = (right - left + 1) / 3;

        stoogeSort(arr, left, right - third); //Для первых 2/3 массива
        stoogeSort(arr, left + third, right); //Для последних 2/3 массива
        stoogeSort(arr, left, right - third); //Для первых 2/3 массива

    }

}

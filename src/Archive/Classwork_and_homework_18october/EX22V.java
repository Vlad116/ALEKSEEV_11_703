package Archive.Classwork_and_homework_18october;

public class EX22V {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean f0 = true, f1 = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1])
                f0 = false;
            if (a[i] <= a[i + 1])
                f1 = false;
        }
        if (f0)
            System.out.println("Массив отсортирован по возрастанию");
        else if (f1)
            System.out.println("Массив отсортирован по убыванию");
        else
            System.out.println("Массив не отсортирован");
    }
}
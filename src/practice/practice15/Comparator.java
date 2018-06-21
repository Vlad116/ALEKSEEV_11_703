package practice.practice15;

public class Comparator implements java.util.Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        int firt = o1;
        int second = o2;
        return getValue(firt) - getValue(second);
    }

    private int getValue(int number){
        int value = 0;
        if (number == 0){
            return 1;
        }
        while (number != 0){
            if (number % 2 == 1){
                value++;
            }else{
                value--;
            }
            number /= 10;
        }
        return Math.abs(value);
    }
}

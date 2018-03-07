package Sniper;

public class Sniper {
    private String name;
    private int countOfShots;

    public Sniper(String name, int countOfShots) {
        this.name = name;
        this.countOfShots = countOfShots;
    }

    public String getName() {
        return name;
    }

    public int getCountOfShots() {
        return countOfShots;
    }

    public static int toCalculateTheScore(Shot[] shots, Circle[] circles) {
        int result = 0;
        boolean flag;
        int range[] = new int[circles.length + 1];
        for (int i = 1; i < range.length; i++) {
            range[i] = circles[i - 1].getRadius();
        }
        for (int i = 0; i < shots.length; i++) {
            flag = false;
            for (int j = 0; j < range.length - 1 && !flag; j++) {
                double theDistanceFromtTheShotToTheCenter = shots[i].calcRadius(shots[i].getA(), shots[i].getB());
                if (theDistanceFromtTheShotToTheCenter > range[j] && theDistanceFromtTheShotToTheCenter <= range[j + 1]) {
                    result += circles[j].getScore();
                    flag = true;
                }
            }
        }
        return result;
    }

    public static void showResult(Shot shot, Circle[] circles) {
        int result = 0;
        boolean flag = false;
        int range[] = new int[circles.length + 1];
        for (int i = 1; i < range.length; i++) {
            range[i] = circles[i - 1].getRadius();
        }
        for (int j = 0; j < range.length - 1 && !flag; j++) {
            double theDistanceFromtTheShotToTheCenter = shot.calcRadius(shot.getA(), shot.getB());
            if (theDistanceFromtTheShotToTheCenter > range[j] && theDistanceFromtTheShotToTheCenter <= range[j + 1]) {
                result = circles[j].getScore();
                flag = true;
            }
        }
        System.out.println("Получено " + result + " очков за выстрел");
    }
}

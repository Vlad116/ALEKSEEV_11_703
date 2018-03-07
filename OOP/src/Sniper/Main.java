package Sniper;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader("input"));
        int countOfCircles = Integer.parseInt(reader.readLine());

        Circle circles[] = new Circle[countOfCircles];
        for (int i = countOfCircles - 1; i >= 0; i--) {
            String radiusWithPoints[] = reader.readLine().split(" ");
            int score = Integer.parseInt(radiusWithPoints[0]);
            int radius = Integer.parseInt(radiusWithPoints[1]);
            Circle circle = new Circle(score,radius);
            circles[i] = circle;
        }

        int countOfShoots = Integer.parseInt(reader.readLine());

        Shot shots[] = new Shot[countOfShoots];
        for (int i = 0; i < countOfShoots; i++) {
            String theCoordinatesOfTheShot[] = reader.readLine().split(",");
            int a = Integer.parseInt(theCoordinatesOfTheShot[0]);
            int b = Integer.parseInt(theCoordinatesOfTheShot[1]);
            Shot shot = new Shot(a, b);
            shots[i] = shot;
        }
        Sniper sniper = new Sniper("Vlad", countOfShoots);
        Sniper.showResult(shots[0], circles);
        System.out.println("Общий счет cтрелка " + sniper.getName() + ": " + Sniper.toCalculateTheScore(shots, circles));
    }
}
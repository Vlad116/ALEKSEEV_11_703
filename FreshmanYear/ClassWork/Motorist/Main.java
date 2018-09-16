package ClassWork.Motorist;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MotoristDataAnalazy motoristDataAnalazy = new MotoristDataAnalazy();
        motoristDataAnalazy.printStat("users.txt","cars.txt");
    }
}

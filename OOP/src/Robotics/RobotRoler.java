package Robotics;

// Двигается по окружности
public class RobotRoler implements Robot {
    private double x = 0.0;
    private double y = 0.0;
    private double cx = 10;
    private double cy = 0;
    private double time = 0;
    private double TravelDistance = 0;
    private int gr = 0;
    private double speed = 9;
    private double radius = 0;
    private String name = "RobotRolerRobotITIS";
    private String functional = "Move along an arc";


    public RobotRoler(double x, double y, int gr,double radius, double cx, double cy, String name) {
        this.x = x;
        this.y = y;
        this.gr = gr;
        this.name = name;
    }

    public String getFunctional() {
        return functional;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Movement(int distance) {
        StartMove(x, y);
        final double OldX = x;
        final double OldY = y;
        //меняем координаты по X
        gr = gr + distance;
        x += cx + radius * Math.sin(gr / 180 * Math.PI);
        //меняем координаты по Y
        y += cy + radius * Math.sin(gr / 180 * Math.PI);
        DistanceTraveled(distance);
        EndMove(x, y);

    }

    @Override
    public void StartMove(double x, double y) {
        System.out.println("Начало движения робота, координаты: x = " + x + " y = " + y);
    }

    @Override
    public void EndMove(double x, double y) {
        System.out.println("Робот закончил перемещение, координаты: x = " + x + " y = " + y + '\n'
                + "Пройденная дистанция:" + getTravelDistance() + '\n'
                + "Затраченное время:" + getTime() + '\n');
    }

    public void DistanceTraveled(double distance) {
        double OldTravelDistance = getTravelDistance();
        TravelDistance += 2 * Math.PI * radius * distance / 360;
        time += ((TravelDistance - OldTravelDistance) / speed);
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public double getTravelDistance() {
        return TravelDistance;
    }
}

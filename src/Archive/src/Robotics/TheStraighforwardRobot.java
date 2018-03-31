package Archive.src.Robotics;

// Двигается Вперед и назад
public class TheStraighforwardRobot implements Robot {
    private double x;
    private double y;
    private double course = 0;
    private double time = 0;
    private double speed = 10;
    private double TravelDistance = 0;
    private String name = "TheStraighforwardRobotITIS";
    private String functional = "Move forward and backward";

    public TheStraighforwardRobot(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public String getFunctional() {
        return functional;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;

    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void moveForward() {
        setCourse(0);
    }

    public void moveBack() {
        setCourse(180);
    }

    public double getSpeed() {
        return speed;
    }

    public double getTime() {
        return time;
    }

    public double getTravelDistance() {
        return TravelDistance;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void Movement(int distance) {
        StartMove(x, y);
        final double OldX = x;
        final double OldY = y;
        //меняем координаты по X
        x += distance * Math.cos(course / 180 * Math.PI);
        //меняем координаты по Y
        y += distance * Math.sin(course / 180 * Math.PI);
        DistanceTraveled(OldX, OldY, x, y);
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

    public void DistanceTraveled(double x, double y, double x2, double y2) {
        double OldTravelDistance = getTravelDistance();
        TravelDistance += Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        time += ((TravelDistance - OldTravelDistance) / speed);
    }
}
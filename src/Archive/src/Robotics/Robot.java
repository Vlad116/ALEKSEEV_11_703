package Archive.src.Robotics;

public interface Robot {

    void StartMove(double x, double y); // Сигнал к началу движения

    void EndMove(double x, double y); // Сигнал об окончании движения

    void Movement(int distance); // передвижение на какое-то кол-во метров

    //void DistanceTraveled(double x, double y, double a, double b);// по факту длина вектора в случае прямоходящих роботов

    double getX();

    String getFunctional();

    String getName();

    void setName(String name);

    void setX(double x);

    //double getCourse();

    //void setCourse(double course);

    //void moveForward();

    //void moveBack();

    double getSpeed();

    double getTime();

    double getTravelDistance();

    double getY();

    void setY(double y);
}

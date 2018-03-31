package OOP.Robotics;

/*Пусть есть три робота один ездит только прямо и назад , второй во все стороны , третий по окружности.
Все стартуют из точки 0,0 и должны прибыть в точку 20,1 либо максимально близко к ней
Cтроки кода с роботом роллером закоментированы т.к. реализация не коректна
*/
public class Competition {
    public static void main(String[] args) {
        TheStraighforwardRobot ROBOT_F = new TheStraighforwardRobot(0, 0, "RobotForward");
        RobotWSAD RobotAllAround = new RobotWSAD(0, 0, "RobotSNWC");
        RobotRoler Roller = new RobotRoler(0, 0, 270, 10, 10, 0, "RobotRoller");
        Robot[] robots = {ROBOT_F, RobotAllAround, Roller};
        System.out.println("Участники соревнования:" + '\n');
        for (int i = 0; i < robots.length; i++) {
            System.out.println("Имя: " + robots[i].getName() + '\n' +
                    "Функционал: " + robots[i].getFunctional() + '\n' +
                    "Скорость: " + robots[i].getSpeed() + '\n');
        }
        ROBOT_F.moveForward();
        ROBOT_F.Movement(20);

        RobotAllAround.moveForward();
        RobotAllAround.Movement(20);
        RobotAllAround.moveRight();
        RobotAllAround.Movement(1);

        //Roller.Movement(170);
        Winner(ROBOT_F, RobotAllAround, Roller);
    }

    public static void Winner(TheStraighforwardRobot A, RobotWSAD B, RobotRoler C) {
        System.out.println("Имя: " + A.getName() + '\n' + "Координаты на финише: x = " + A.getX() + ",y = " + A.getY());
        System.out.println("Имя: " + B.getName() + '\n' + "Координаты на финише: x = " + B.getX() + ",y = " + B.getY());
        //System.out.println("Имя: " + C.getName() + '\n' + "Координаты на финише: x = " + C.getX() + ",y = " + C.getY());
        if (A.getTime() < B.getTime() /*&& A.getTime() < C.getTime()*/) {
            System.out.println("У робота " + A.getName() + " лучшее время прохождения трассы " + A.getTime());
        } else if (B.getTime() < A.getTime() /*&& B.getTime() < C.getTime()*/) {
            System.out.println("У робота " + B.getName() + " лучшее время прохождения трассы " + B.getTime());
        /*} else {
            System.out.println("У робота " + C.getName() + " лучшее время прохождения трассы " + C.getTime());
        }*/
        }
    }
}
package Archive.ControlWork2.src.CW3Figure;

abstract class Figure {
    String color;
    String name;
    int x;
    int y;

    public abstract boolean canMove(int x, int y);

    abstract String getName();

    abstract String getColor();

    abstract int getX();

    abstract int getY();

    abstract void setX(int x);

    abstract void setY(int y);
}
package CW3Figure;

public class ChessBoat extends Figure {
    String color;
    String name;
    int x;
    int y;

    public ChessBoat(String color, String name, int x, int y) {
        this.color = color;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0 && y <= 7) {
            this.y = y;
        }
    }

    public void setX(int x) {
        if (x >= 0 && x <= 7) {
            this.x = x;
        }
    }

    @Override
    public boolean canMove(int x, int y) {
        if ((this.x - x == 0 || this.y - y == 0) && !((this.x == x && this.y == y))) {
            /*this.x = x;
            this.y = y;*/
            return true;
        } else {
            return false;
        }
    }
}
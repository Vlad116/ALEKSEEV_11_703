package Archive.ControlWork2.src.CW3Figure;

public class Horse extends Figure {
    String color;
    String name;
    int x;
    int y;

    public Horse(String color, String name, int x, int y) {
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
        boolean f = false;
        if (!(this.x == x && this.y == y)) {
            if ((Math.abs(this.x - x) == 2 && Math.abs(this.y - y) == 1)) {
                /*this.x = x;
                this.y = y;*/
                f = true;

            } else if ((Math.abs(this.x - x) == 1 && Math.abs(this.y - y) == 2)) {
                /*this.x = x;
                this.y = y;*/
                f = true;
            }
        }
        return f;
    }
}
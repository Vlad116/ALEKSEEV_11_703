package CW3Figure;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Figure King = new King("black", "king", r.nextInt(8), r.nextInt(8));
        Figure Horse = new Horse("black", "horse", r.nextInt(8), r.nextInt(8));
        Figure ChessBoat = new ChessBoat("black", "boat", r.nextInt(8), r.nextInt(8));
        Figure KingWhite = new King("white", "king", r.nextInt(8), r.nextInt(8));
        Figure HorseWhite = new Horse("white", "horse", r.nextInt(8), r.nextInt(8));
        Figure ChessBoatWhite = new ChessBoat("white", "boat", r.nextInt(8), r.nextInt(8));
        Figure[] figures = {King, Horse, ChessBoat, KingWhite, HorseWhite, ChessBoatWhite};
        for (int z = 0; z < figures.length; z++) {
            System.out.println("x = " + (figures[z].getX()+1) + " y = " + (figures[z].getY()+1));
        }
        for (int figure = 0; figure < figures.length; figure++) { // цикл по всем фигурам в массиве
            int x1 = figures[figure].getX();
            int y1 = figures[figure].getY();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (figures[figure].canMove(i, j)) {
                        for (int k = 0; k < figures.length; k++) {
                            if (figure != k) {
                                if (((i == figures[k].x) && (j == figures[k].y) && !(figures[figure].getColor().equals(figures[k].getColor())))) {
                                    System.out.println("Фигура - " + figures[figure].getColor() + " " + figures[figure].getName() + " Координаты на поле: " + (x1 + 1) + "," + (y1 + 1) +
                                            " может атаковать фигуру - " + figures[k].getColor() + " " + figures[k].getName() + " Координаты на поле: " + (figures[k].getX() + 1) + "," + (figures[k].getY() + 1));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

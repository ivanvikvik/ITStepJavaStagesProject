package by.itstep.vikvik.javastages.stage12.task01.model.logic;

public class ChessPiecesLogic {
    public static boolean checkRookStep(int x1, int y1, int x2, int y2) {
        return (x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2);
    }
}

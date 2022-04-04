package by.itstep.vikvik.javastages.stage12.task01.controller;

import by.itstep.vikvik.javastages.stage12.task01.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input four numbers: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = true;  // call logic

        String msg = result ? "YES" : "NO";

        Printer.print(msg);
    }
}

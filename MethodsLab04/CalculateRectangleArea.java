package MethodsLab04;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int area = getRectangleArea(width, length);
        System.out.println(area);

    }

    private static int getRectangleArea(int width, int length) {
        return width * length;
    }
}

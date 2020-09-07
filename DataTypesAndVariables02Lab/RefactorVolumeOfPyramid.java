package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double area = (length * width * height) / 3;

        System.out.print("Length: Width: Height: ");

        System.out.printf("Pyramid Volume: %.2f", area);
    }
}

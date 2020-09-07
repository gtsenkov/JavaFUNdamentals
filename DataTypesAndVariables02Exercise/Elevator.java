package DataTypesAndVariables02Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int persons = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int courses = persons / capacity;
        if ( persons % capacity == 0) {
            System.out.println(courses);
        }
        else {
            courses++;
            System.out.println(courses);
        }
    }
}


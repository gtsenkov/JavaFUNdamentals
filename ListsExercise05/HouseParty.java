package ListsExercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations = Integer.parseInt(scan.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < iterations; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input[2].equals("not")) {
                if (!guestList.contains(input[0])) {
                    System.out.printf("%s is not in the list!%n", input[0]);
                } else {
                    guestList.remove(input[0]);
                }
            } else {
                if (guestList.contains(input[0])) {
                    System.out.printf("%s is already in the list!%n", input[0]);
                } else {
                    guestList.add(input[0]);
                }
            }
        }
        for (String person : guestList) {
            System.out.println(person);
        }
    }
}

package ListsExercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] passengers = scan.nextLine().split(" ");
        List<Integer> waggonsAndPassengers = new ArrayList<>();
        for (String passenger : passengers) {
            int current = Integer.parseInt(passenger);
            waggonsAndPassengers.add(current);
        }
        int capacity = Integer.parseInt(scan.nextLine());
        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("end")) {
            if ("Add".equals(command[0])) {
                waggonsAndPassengers.add(Integer.parseInt(command[1]));
            } else {
                int passengersToAccommodate = Integer.parseInt(command[0]);
                for (int i = 0; i < waggonsAndPassengers.size(); i++) {
                    int capacityIncrease = waggonsAndPassengers.get(i) + passengersToAccommodate;
                    if (capacityIncrease <= capacity) {
                        waggonsAndPassengers.set(i, capacityIncrease);
                        break;
                    }
                }
            }
            command = scan.nextLine().split(" ");
        }
        System.out.println(waggonsAndPassengers.toString().replaceAll("[\\[\\],]", ""));
    }
}

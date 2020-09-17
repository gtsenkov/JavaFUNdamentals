package AssociativeArraysExercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> registerMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            String [] input = scan.nextLine().split(" ");
            String command = input[0];
            String name = input[1];

            if (command.equals("register")) {
                String licensePlate = input[2];
                if (registerMap.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                } else {
                    registerMap.put(name, licensePlate);
                    System.out.printf("%s registered %s successfully%n", name, licensePlate);

                }
            } else if (command.equals("unregister")) {
                if (registerMap.containsKey(name)) {
                    System.out.printf("%s unregistered successfully%n", name);
                    registerMap.remove(name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }

        }
        registerMap.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}

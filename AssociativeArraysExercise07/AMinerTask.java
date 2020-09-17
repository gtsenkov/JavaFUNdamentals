package AssociativeArraysExercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> metalQuantity = new LinkedHashMap<>();
        String input = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        metalQuantity.putIfAbsent(input, quantity);

        while (!input.equals("stop")) {
            input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }
            quantity = Integer.parseInt(scan.nextLine());
            if (metalQuantity.containsKey(input)) {
                metalQuantity.put(input, metalQuantity.get(input) + quantity);
            }
            metalQuantity.putIfAbsent(input, quantity);
        }
        for (Map.Entry<String, Integer> entrySet : metalQuantity.entrySet()) {

            System.out.printf("%s -> %d%n", entrySet.getKey(), entrySet.getValue());
        }
    }
}

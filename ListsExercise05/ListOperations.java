package ListsExercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        List<Integer> numbers = Arrays
                .stream(line.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] commandTokens = command.split("\\s+");
            int number = 0;
            if (!commandTokens[0].equals("Shift")) {
                number = Integer.parseInt(commandTokens[1]);
            }
            switch (commandTokens[0]) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandTokens[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (number >= 0 && number < numbers.size()) {
                        numbers.remove(number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int shiftTimes = Integer.parseInt(commandTokens[2]);
                    if (commandTokens[1].equals("left")) {
                        for (int i = 0; i < shiftTimes; i++) {
                            int temp = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(temp);
                        }

                    } else if (commandTokens[1].equals(("right"))) {
                        for (int i = 0; i < shiftTimes; i++) {
                            int temp = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, temp);
                        }
                    }
            }
            command = scan.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}

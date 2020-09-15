package ListsExercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String list = scan.nextLine();
        List<Integer> numbers = Arrays
                .stream(list.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] command = scan.nextLine().split("\\s+");
        while (!command[0].equals("end")) {
            Integer element = Integer.valueOf(command[1]);
            switch (command[0]) {
                case "Delete":
                    while (numbers.contains(element))
                    numbers.remove(element);
                    break;
                case "Insert":
                    int position = Integer.parseInt(command[2]);
                    if (position >= 0 && position < numbers.size()) {
                        numbers.add(position, element);
                    }
                    break;
            }
            command = scan.nextLine().split("\\s+");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}

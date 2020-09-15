package ListsExercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    int sum = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String list = scan.nextLine();
        List<Integer> numbers = Arrays
                .stream(list.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String secondLine = scan.nextLine();
        String[] tokens = secondLine.split("\\s+");
        int bomb = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);
        while (numbers.contains(bomb)) {
            int rightIndex = numbers.indexOf(bomb);
            int leftIndex = numbers.indexOf(bomb);

            int rightBound = rightIndex + power;
            for (int shots = 0; shots < power; shots++) {
                if (rightBound < numbers.size()) {
                    numbers.remove(rightBound);
                    rightBound--;
                    continue;
                }
                if (rightBound == numbers.size() - 1) {
                    numbers.remove(rightBound);
                }
                if (rightBound > numbers.size() - 1) {
                    rightBound--;
                }
            }

            for (int shots = 0; shots < power; shots++) {
                if (leftIndex > 0) {
                    leftIndex--;
                    numbers.remove(leftIndex);
                }
            }
            Integer bombValue = Integer.valueOf(bomb);
            numbers.remove(bombValue);
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        //System.out.println(numbers);
    }
}
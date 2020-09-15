package ListsExercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbersAsDescribed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String list = scan.nextLine();
        List<Integer> numbers = Arrays
                .stream(list.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String secondLine = scan.nextLine();
        String [] tokens = secondLine.split("\\s+");
        int bomb = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);
        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);
            int leftBound = Math.max(index - power, 0);
            int rightBound = Math.min(index + power, numbers.size() - 1);
            for (int i = rightBound; i >= leftBound ; i--) {
                numbers.remove(i);

            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        }
        System.out.println(sum);
    }
}

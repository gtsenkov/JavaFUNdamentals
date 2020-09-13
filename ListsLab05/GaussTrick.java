package ListsLab05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Integer> numbers =
                Arrays.stream(input.split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        for (int i = 0; i <= numbers.size() / 2; i++) {
            int j = numbers.size() - 1;
            if (i != j) {
                numbers.set(i, numbers.get(i) + numbers.get(j));
                numbers.remove(numbers.size() - 1);
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }
}

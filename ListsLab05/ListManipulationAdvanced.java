package ListsLab05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String list = scan.nextLine();

        List<Integer> numbers =
                Arrays.stream(list.split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String command = scan.nextLine();
        while (!command.equals("end")){
            String [] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Contains":
                    isContaining(numbers, tokens[1]);
                    break;
                case "Print":
                    switch (tokens[1]) {
                        case "even":
                            printEvenNumbers(numbers);
                            break;
                        case "odd":
                            printOddNumbers(numbers);
                    }
                            break;
                case "Get":
                    getSum(numbers);
                    break;
                case "Filter":
                    switch (tokens[1]){
                        case "<":
                            printSmaller (numbers, tokens[2]);
                            break;
                        case ">":
                            printBigger (numbers, tokens[2]);
                            break;
                        case ">=":
                            printBiggerOrEqual (numbers, tokens[2]);
                            break;
                        case "<=":
                            printSmallerOrEqual (numbers, tokens[2]);
                            break;

                    }
            }
            command = scan.nextLine();
        }
        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }


    private static void printSmallerOrEqual(List<Integer> numbers, String token) {
        int comparator = Integer.parseInt(token);
        for (Integer number : numbers) {
            if (number >= comparator) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printBiggerOrEqual(List<Integer> numbers, String token) {
        int comparator = Integer.parseInt(token);
        for (Integer number : numbers) {
            if (number >= comparator) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printBigger(List<Integer> numbers, String token) {
        int comparator = Integer.parseInt(token);
        for (Integer number : numbers) {
            if (number > comparator) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printSmaller(List<Integer> numbers, String token) {
        int comparator = Integer.parseInt(token);
        for (Integer number : numbers) {
            if (number < comparator) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printOddNumbers(List<Integer> numbers) {

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void isContaining(List<Integer> numbers, String number) {
        boolean numberIsHere = numbers.contains(Integer.parseInt(number));
        if (numberIsHere){
            System.out.println("Yes");
        }
        else {
            System.out.println("No such number");
        }


    }
}

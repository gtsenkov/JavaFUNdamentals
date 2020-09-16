package AssociativeArraysLab07;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> sorted = Arrays
                .stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .collect(Collectors.toList());
        for (Integer integer : sorted) {
            System.out.print(integer + " ");

        }
    }
}

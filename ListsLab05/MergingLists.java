package ListsLab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();

        List<Integer> firstList = inputTopList(input1);
        List<Integer> secondList = inputTopList(input2);

        int minLength = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minLength ; i++) {
            System.out.print(firstList.get(i) + " ");
            System.out.print(secondList.get(i) + " ");

        }

        printAfterIndex(firstList, minLength);
        printAfterIndex(secondList, minLength);

    }

    private static void printAfterIndex(List<Integer> list, int startIndex) {
        for (int i = startIndex; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");

        }
    }

    private static List<Integer> inputTopList(String input) {
        String [] parts = input.split(" ");

        List<Integer> result = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            result.add(current);

        }

        return result;
    }
}

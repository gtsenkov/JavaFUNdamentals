package AssociativeArraysExercise07;

import com.sun.source.tree.Tree;

import java.util.*;

public class CountCharsIn1String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < input.length() ; i++) {
            char letter = input.charAt(i);
            String charAsLetter = letter + "";
            if (charAsLetter.equals(" ")) {
                continue;
            }
            if (counter.containsKey(charAsLetter)){
                counter.put(charAsLetter, counter.get(charAsLetter) + 1);
            }
            counter.putIfAbsent(charAsLetter, 1);
        }
        for (Map.Entry<String, Integer> set : counter.entrySet()) {

            System.out.printf("%s -> %d%n", set.getKey(), set.getValue());

        }
    }
}

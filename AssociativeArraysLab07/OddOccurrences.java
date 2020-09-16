package AssociativeArraysLab07;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String toLowerCase = word.toLowerCase();
            if (counts.containsKey(toLowerCase)) {
                counts.put(toLowerCase, counts.get(toLowerCase) + 1);
            } else {
                counts.put(toLowerCase, 1);
            }
        }

        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entrySet : counts.entrySet()) {
            if (entrySet.getValue() % 2 != 0) {
                odds.add(entrySet.getKey());
            }
        }
        for (int i = 0; i <odds.size() ; i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");

        }

        }
    }
}
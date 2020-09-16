package AssociativeArraysLab07;

import java.sql.Struct;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<String>> relation = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {

            String word = scan.nextLine();
            String synonym = scan.nextLine();

            relation.putIfAbsent(word, new ArrayList<>());
            relation.get(word).add(synonym);


        }
        for (Map.Entry<String, ArrayList<String>> entry : relation.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString().replaceAll("[\\[\\]]", ""));

        }
    }
}
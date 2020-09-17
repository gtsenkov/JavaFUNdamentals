package AssociativeArraysExercise07;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        String input = scan.nextLine();

        while (!input.equals("end")) {

            String[] courseInfo = input.split(" : ");
            String courseName = courseInfo[0];
            String student = courseInfo[1];

            coursesMap.putIfAbsent(courseName, new ArrayList());
            coursesMap.get(courseName).add(student);

            input = scan.nextLine();
        }
        coursesMap
                .entrySet()
                .stream()
                .sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2)  )
                            .forEach(s -> System.out.println(String.format("-- %s", s)));
                });
    }
}

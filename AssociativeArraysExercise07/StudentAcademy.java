package AssociativeArraysExercise07;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            studentsMap.putIfAbsent(name,new ArrayList<>());
            studentsMap.get(name).add(grade);
        }
        studentsMap.
                entrySet()
                .stream()
                .filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0) >= 4.50)
                .sorted((s1, s2) -> {
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    return  Double.compare(second, first);
                })
                .forEach(s -> System.out.println(String.format("%s -> %.2f",
                        s.getKey(),
                        s.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0)
                )));
    }
}

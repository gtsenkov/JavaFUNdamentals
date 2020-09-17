package AssociativeArraysExercise07;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> companyMap = new LinkedHashMap<>();
        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String employeeID = tokens[1];
            companyMap.putIfAbsent(company, new ArrayList<>());
            List<String> id = companyMap.get(company);
            if (!id.contains(employeeID)) {
                companyMap.get(company).add(employeeID);
            }
            input = scan.nextLine();
        }

        companyMap
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach(e -> System.out.printf("-- %s%n", e));
                });


    }
}

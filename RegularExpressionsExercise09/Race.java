package RegularExpressions09;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String participantsInfo = scan.nextLine();
        String[] participant = participantsInfo.split(", ");
        HashMap<String, Integer> participantsMap = new LinkedHashMap<>();
        List<String> racers = new ArrayList<>(Arrays.asList(participant));

        Pattern letterPattern = Pattern.compile("[a-z]|[A-Z]");
        Pattern digitPattern = Pattern.compile("[0-9]");

        String resultInfo = scan.nextLine();
        while (!resultInfo.equals("end of race")) {
            Matcher nameMatcher = letterPattern.matcher(resultInfo);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {

                name.append(nameMatcher.group());

            }

            if (racers.contains(name.toString())) {
                participantsMap.putIfAbsent(name.toString(), 0);
                int oldKm = participantsMap.get(name.toString());
                int newKm = 0;

                Matcher digitMatcher = digitPattern.matcher(resultInfo);
                while (digitMatcher.find()) {
                    newKm += Integer.parseInt(digitMatcher.group());
                }
                participantsMap.put(name.toString(), oldKm + newKm);
            }


            resultInfo = scan.nextLine();
        }
        int[] num = {1};

        participantsMap
                .entrySet()
                .stream()
                .sorted((r1, r2) ->
                        r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r -> {
                    switch (num[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s", r.getKey()));
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s", r.getKey()));
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s", r.getKey()));
                            break;
                    }
                    num[0]++;
                });


    }
}

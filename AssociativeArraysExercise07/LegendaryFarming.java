package AssociativeArraysExercise07;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> item = new LinkedHashMap<>();
        String inputLine = scan.nextLine();
        String[] data = inputLine.split("\\s+");
        int value = Integer.parseInt(data[0]);
        String key = data[1].toLowerCase();
        item.put(key, value);
        while ((item.get(key) < 250 || !key.equals("shards")) && (item.get(key) < 250 || !key.equals("fragments")) && (item.get(key) < 250 || !key.equals("motes"))) {
            for (int i = 2; i < data.length; i += 2) {
                value = Integer.parseInt(data[i]);
                key = data[i+1].toLowerCase();

                if (item.containsKey(key)) {
                    item.put(key, item.get(key) + value);
                }
                item.putIfAbsent(key, value);
                if (item.get(key) >= 250 && (key.equals("shards") || key.equals("fragments") || key.equals("motes"))) {
                    break;
                }
            }
            if (item.get(key) >= 250 && (key.equals("shards") || key.equals("fragments") || key.equals("motes"))) {
                break;
            }
            inputLine = scan.nextLine();
            data = inputLine.split("\\s+");
            value = Integer.parseInt(data[0]);
            key = data[1].toLowerCase();
            if (item.containsKey(key)) {
                item.put(key, item.get(key) + value);
            }
            item.putIfAbsent(key, value);
            if (item.get(key) >= 250 && key.equals("shards") && key.equals("fragments") && key.equals("motes")) {
                break;
            }
        }

        Map<String, Integer> legendary = new LinkedHashMap<>();
        Map<String, Integer> scrap = new LinkedHashMap<>();
        legendary.put("shards", 0);
        legendary.put("fragments", 0);
        legendary.put("motes", 0);
        for (Map.Entry<String, Integer> entry : item.entrySet()) {
            switch (entry.getKey()) {
                case "shards":
                    if (entry.getValue() >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        entry.setValue(entry.getValue() - 250);
                    }
                    legendary.put(entry.getKey(), entry.getValue());
                    break;
                case "fragments":
                    if (entry.getValue() >= 250) {
                        System.out.println("Valanyr obtained!");
                        entry.setValue(entry.getValue() - 250);
                    }

                    legendary.put(entry.getKey(), entry.getValue());
                    break;
                case "motes":
                    if (entry.getValue() >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        entry.setValue(entry.getValue() - 250);
                    }
                    legendary.put(entry.getKey(), entry.getValue());
                    break;
                default:
                    scrap.put(entry.getKey(), entry.getValue());
            }

        }
        legendary
                .entrySet()
                .stream()
                .sorted((i1, i2) -> {
                    int result = i2.getValue().compareTo(i1.getValue());
                    if (result == 0) {
                        result = i1.getKey().compareTo(i2.getKey());
                    }
                    return result;
                })
                .forEach(i -> System.out.printf("%s: %d%n", i.getKey(), i.getValue()));
        scrap
                .entrySet()
                .stream()
                .sorted((i1, i2) -> i1.getKey().compareTo(i2.getKey()))
                .forEach(i -> System.out.printf("%s: %d%n", i.getKey(), i.getValue()));
    }

}


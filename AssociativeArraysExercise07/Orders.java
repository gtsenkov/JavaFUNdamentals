package AssociativeArraysExercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        String inputLine = scan.nextLine();

        while (!inputLine.equals("buy")) {

            String[] data = inputLine.split(" ");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (productQuantity.containsKey(product)){
                productQuantity.put(product, productQuantity.get(product) + quantity);
            }
            productQuantity.putIfAbsent(product, quantity);

            if (productPrice.containsKey(product)){
                productPrice.put(product, price);
            }
            productPrice.putIfAbsent(product, price);

            inputLine = scan.nextLine();
        }
        productQuantity.forEach((k, v) -> System.out.println(String.format("%s -> %.2f", k, v * productPrice.get(k))));
    }
}

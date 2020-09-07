package BasicSyntaxConditionalStatementsAndLoopsExercise01;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double money = 0;
        while (!input.equals("Start")) {
            if (input.equals("0.1") || input.equals("0.2") || input.equals("0.5") || input.equals("1") || input.equals("2")) {
                money += Double.parseDouble(input);
                input = scan.nextLine();
            }
            else {
                double parse = Double.parseDouble(input);
                System.out.printf("Cannot accept %.2f%n", parse);
                input = scan.nextLine();
            }
        }
        while (!input.equals("End")){
            switch (input) {
                case "Nuts":
                    if (money >= 2.0){
                        System.out.println("Purchased Nuts");
                        money -= 2.0;
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Water":
                    if (money >= 0.7){
                        System.out.println("Purchased Water");
                        money -= 0.7;
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Crisps":
                    if (money >= 1.5){
                        System.out.println("Purchased Crisps");
                        money -= 1.5;
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Soda":
                    if (money >= 0.8){
                        System.out.println("Purchased Soda");
                        money -= 0.8;
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Coke":
                    if (money >= 1.0){
                        System.out.println("Purchased Coke");
                        money -= 1.0;
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Start":
                        break;
                default:
                    System.out.println("Invalid product");
                    break;

            }
            input = scan.nextLine();
        }
        if (money >= 0) {
            System.out.printf("Change: %.2f", money);
        }

    }
}

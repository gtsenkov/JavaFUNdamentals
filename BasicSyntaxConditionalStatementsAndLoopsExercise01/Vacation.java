package BasicSyntaxConditionalStatementsAndLoopsExercise01;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double totalPrice = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalPrice = 8.45;
                        break;
                    case "Saturday":
                        totalPrice = 9.8;
                        break;
                    case "Sunday":
                        totalPrice = 10.46;
                        break;
                }
                if (count >= 30){
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        totalPrice = 10.9;
                        break;
                    case "Saturday":
                        totalPrice = 15.6;
                        break;
                    case "Sunday":
                        totalPrice = 16;
                        break;
                }
                if (count >= 100){
                    count=count-10;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalPrice = 15;
                        break;
                    case "Saturday":
                        totalPrice = 20;
                        break;
                    case "Sunday":
                        totalPrice = 22.5;
                        break;
                }
                if (count >= 10 && count <= 20){
                    totalPrice *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice*count);
    }
}

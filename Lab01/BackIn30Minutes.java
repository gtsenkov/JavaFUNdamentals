package Lab01;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hoursToMinutes = hours * 60;
        int timeAfter30Minutes = hoursToMinutes + minutes + 30;
        if (hours<23) {
            hours = hours;
            int resultInHours = timeAfter30Minutes / 60;
            int resultInMinutes = timeAfter30Minutes % 60;
            System.out.printf("%d:%02d", resultInHours, resultInMinutes);
        }
        else {
            hours = 0;
            int resultInMinutes = timeAfter30Minutes % 60;
            System.out.printf("%d:%02d", hours, resultInMinutes);
        }


    }
}


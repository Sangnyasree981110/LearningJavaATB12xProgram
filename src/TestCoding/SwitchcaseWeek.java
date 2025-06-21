package TestCoding;

import java.util.Scanner;

public class SwitchcaseWeek {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of day in week 1-7");
    int dayNumber = scanner.nextInt();

    String dayName;

        switch (dayNumber) {
        case 1:
            dayName = "Sunday";
            break;
        case 2:
            dayName = "Monday";
            break;
        case 3:
            dayName = "Tuesday";
            break;
        case 4:
            dayName = "Wednesday";
            break;
        case 5:
            dayName = "Thursday";
            break;
        case 6:
            dayName = "Friday";
            break;
        case 7:
            dayName = "Saturday";
            break;
        default:
            dayName = "Invalid day number. Please enter a number between 1 and 7.";
            break;
    }

        System.out.println("The day of the week is: " + dayName);

}
}

package dev.nacho.months_and_days;
import java.util.Scanner;

public class AppMonthDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a valid month number: "); 
        int monthNumber = scanner.nextInt();

        MonthCalculator monthCalculator = new MonthCalculator();
        Month month = monthCalculator.getMonth(monthNumber); 
    

        System.out.println("Month " +  month.getName());
        System.out.println();      
        System.out.println("Days: " + month.getDays());

        scanner.close();
    }
    
}
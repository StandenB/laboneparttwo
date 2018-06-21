import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Labtwo {
    public static void main(String[] args) throws IOException {
    	
    	long days, yearDelta, monthDelta, dayDelta;
    	
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd mm yyyy");
        //final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scnr = new Scanner (new InputStreamReader(System.in));
        //System.out.print("test");
        
        //Get first date
        System.out.println("Enter First Date ");
        //final String firstInput = reader.readLine(); - from example
        final String firstInput = scnr.nextLine();
        
        //Get second date
        System.out.println("Enter Second Date ");
        //final String secondInput = reader.readLine(); - from example
        final String secondInput = scnr.nextLine();
        
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        days = ChronoUnit.DAYS.between(firstDate, secondDate);
        
        yearDelta = days / 365;
        dayDelta = days - (yearDelta * 365) + (yearDelta / 4);
        monthDelta = days / 30;
        dayDelta = dayDelta - (monthDelta * 30);
        
        System.out.println("It is " + yearDelta + "years " + 
        					monthDelta + "months and " + dayDelta + 
        					"days between dates.");
    }
}
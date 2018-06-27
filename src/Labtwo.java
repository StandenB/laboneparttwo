
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class Labtwo {
    
	public static void main(String[] args) throws ParseException,
	java.text.ParseException {
			  
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	
    	double yearDelta, monthDelta, dayDelta;
    	
        Scanner scnr = new Scanner (new InputStreamReader(System.in));
        
        //Get first date
        System.out.println("Enter First Date (DD/MM/YYYY) ");
        // System.out.println("");
        Date firstDate = sdf.parse(scnr.nextLine());
        
        //Get second date
        System.out.println("Enter Second Date (DD/MM/YYYY) ");
        Date secondDate = sdf.parse(scnr.nextLine());
        
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    
        yearDelta = (diff / 365.25);
        long years = (long) yearDelta; 
        dayDelta = diff - (years * 365.25);
        monthDelta = dayDelta / 30.4375;
        long months = (long) monthDelta;
        dayDelta = dayDelta - (months * 30.4375);
        long days = (long) dayDelta;
        
        System.out.println("It is " + years + " years " + 
        					months + " months and " + days + 
        					" days between dates.");
	}
}
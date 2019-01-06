package Calendar;


import java.util.Date;
import java.util.GregorianCalendar;

// Template for a Calendar
public class Calendar {

	public void calanderLayout() {
		 // Display the lines
	  
	   displayMonthAndYear();
       System.out.println("_____________________________________");
       System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
       
       
	}
	
	
	public Date getTodaysTime() {
		GregorianCalendar a = new GregorianCalendar();
	
		return a.getTime();
	}
	
	public int getMonth() {
		 GregorianCalendar a = new GregorianCalendar();
		 Date Tmonth = a.getTime();
		 return Tmonth.getMonth();	
	}
	public int getYear() {
		 GregorianCalendar a = new GregorianCalendar();
		 Date Tyear = a.getTime();
		 
		 return Tyear.getYear();
	}
	
	public void displayMonthAndYear() {
		
		int month = getMonth();
		int year  = getYear() + 1900;
		if(month == 0) {
			System.out.println("Month: Januray                " + year);
		}
		else {
			System.out.print("Month: ?");
		}
		
	
	}
	
	

}

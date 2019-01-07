package Calendar;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Template for a Calendar
public class myCalendar {

	public void calanderLayout() {
		 // Display the lines
	  
	   displayMonthAndYear();
       System.out.println("_____________________________________");
       System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
       currentDates();
       
       
	}
	
	
	public int getMonth() {
		 Calendar c = Calendar.getInstance();
		 int TMonth = c.get(Calendar.MONTH);
		 
		 return TMonth;
	}
	
	public int getYear() {
		 Calendar c = Calendar.getInstance();
		 int Tyear = c.get(Calendar.YEAR);
		 
		 return Tyear;
	}
	
	public void currentDates() {
		 Calendar c = Calendar.getInstance();
		 int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		 System.out.println(days);
		 
			 for(int j = 1; j < days+1; j++) {
				 
			 System.out.print(j + " ");
			 }
		 
			
		 
	}
	
	
	
	public void displayMonthAndYear() {
		
		int month = getMonth();
		int year  = getYear();
		
		switch(month) {
		case 0 : 
			System.out.println("Month: Januray                 " + year);
			break;
			
		case 1 : 
			System.out.println("Month: Feburary                " + year);
			break;
			
		case 2 : 
			System.out.println("Month: March                   " + year);
			break;
			
		case 3 : 
			System.out.println("Month: April                   " + year);
			break;
		
		case 4 : 
			System.out.println("Month: May                     " + year);
			break;
			
		case 5 : 
			System.out.println("Month: June                    " + year);
			break;
		
		case 6 : 
			System.out.println("Month: July                    " + year);
			break;
		
		case 7 : 
			System.out.println("Month: August                  " + year);
			break;
			
		case 8 : 
			System.out.println("Month: September               " + year);
			break;
			
		case 9 : 
			System.out.println("Month: October                 " + year);
			break;
			
		case 10 : 
			System.out.println("Month: November                " + year);
			break;
			 
		case 11 : 
			System.out.println("Month: December                " + year);
			break;
			
		
		}
	
	}
	
	public void displayDates() {
		
	}
	

}
